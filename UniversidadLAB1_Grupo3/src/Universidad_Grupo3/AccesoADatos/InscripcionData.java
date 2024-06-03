package Universidad_Grupo3.AccesoADatos;

/**
 *
 * @author lab1 C2 grupo3
 */
import Universidad_Grupo3.AccesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Universidad_Grupo3.Entidades.Inscripcion;
import Universidad_Grupo3.Entidades.Materia;
import Universidad_Grupo3.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
        this.matData = new MateriaData();
        this.aluData = new AlumnoData();
    }

    /*
    CREATE TABLE IF NOT EXISTS `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL,
  PRIMARY KEY (`idInscripto`),
  UNIQUE KEY `idAlumno` (`idAlumno`,`idMateria`),
  KEY `idMateria` (`idMateria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
     */
    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                + "VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            // ps.setInt, ps.setString, ps.setDate, ps.setBoolean, etc.
            ps.setInt(1, (int) insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,
                        "Inscripcion guardada con exito. ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el coso (la inscripción)");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT * FROM inscripcion ";
        PreparedStatement ps = null;
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // rs.getInt, rs.getString, rs.getDate, etc.
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        String sql = "SELECT * FROM inscripcion"
                + " WHERE idAlumno = ?";
        PreparedStatement ps = null;
        List<Inscripcion> inscripciones = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // rs.getInt, rs.getString, rs.getDate, etc.
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(aluData.buscarAlumno(id));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        String sql = "SELECT "
                + "materia.idMateria, materia.nombre, año "
                + " FROM inscripcion "
                + " JOIN materia ON ( inscripcion.idMateria = materia.idMateria )"
                + " WHERE "
                + "inscripcion.idAlumno = ? ";
        PreparedStatement ps = null;
        List<Materia> materias = new ArrayList<>();

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // rs.getInt, rs.getString, rs.getDate, etc.
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

        return materias;
    }

    /*
inscripcion                 materia
-----------                 ------
idInscripto                 idMateria
nota                        nombre
idAlumno                    año
idMateria                   estado
                            
                            

     */
    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materiasNOcursadas = matData.listarMaterias();

        List<Materia> materiasCursadas = obtenerMateriasCursadas(id);
        
        if(materiasNOcursadas.removeAll(materiasCursadas)){
            System.out.println("Lista Cambiada!");
        }
        return materiasNOcursadas;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion "
                + " WHERE idAlumno = ? "
                + " AND idMateria = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            // ps.setInt, ps.setString, ps.setDate, ps.setBoolean, etc.
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el coso ");
            } else {
                JOptionPane.showMessageDialog(null, "fila != 1 ");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion "
                + " SET "
                + " nota = ? "
                + " WHERE idAlumno = ? "
                + " AND idMateria = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            // ps.setInt, ps.setString, ps.setDate, ps.setBoolean, etc.
            ps.setInt(1, (int) nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int exito = ps.executeUpdate();
            if (exito != 1) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el coso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }

    /*
inscripcion                 alumno
-----------                 ------
idInscripto                 idAlumno
nota                        dni
idAlumno                    apellido
idMateria                   nombre
                            fechaNacimiento
                            estado

     */
    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT "
                + " alumno.idAlumno, dni, apellido, nombre, fechaNacimiento"
                + " FROM inscripcion "
                + " JOIN alumno ON ( inscripcion.idAlumno = alumno.idAlumno ) "
                + " WHERE alumno.estado = 1"
                + " AND idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // rs.getInt, rs.getString, rs.getDate, etc.
                Alumno alumno = new Alumno();

                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }

        return alumnos;
    }

}


/*
CREATE DATABASE IF NOT EXISTS `universidad_grupo3` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `universidad_grupo3`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `idAlumno` int(11) NOT NULL AUTO_INCREMENT,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`idAlumno`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE IF NOT EXISTS `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL,
  PRIMARY KEY (`idInscripto`),
  UNIQUE KEY `idAlumno` (`idAlumno`,`idMateria`),
  KEY `idMateria` (`idMateria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`idMateria`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`);
COMMIT;
 */
