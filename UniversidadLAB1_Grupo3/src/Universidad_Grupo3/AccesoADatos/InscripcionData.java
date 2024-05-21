
package Universidad_Grupo3.AccesoADatos;
/**
 *
 * @author lab1 C2 grupo3
 */

import Universidad_Grupo3.AccesoADatos.Conexion;
import java.sql.Connection;
import Universidad_Grupo3.Entidades.Inscripcion;
import Universidad_Grupo3.Entidades.Materia;
import Universidad_Grupo3.Entidades.Alumno;
import java.util.List;

public class InscripcionData {
    
    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
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
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                + "VALUES (?, ?, ?)";

        
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        String sql = "SELECT * FROM inscripcion WHERE estado = 1 ";
        
        return null;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        String sql = "SELECT * FROM inscripcion WHERE estado = 1 "
                + " AND idAlumno = ?";
         
        return null;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        String sql = "SELECT * FROM inscripcion WHERE estado = 1 "
                + " AND idAlumno = ?";
        
        return null;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
        String sql = "SELECT * FROM inscripcion WHERE estado = 1 "
                + " AND idAlumno = ?";
        
        return null;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "UPDATE materia "
                + " SET "
                + " estado = 0 "
                + " WHERE idAlumno = ? "
                + " AND idMateria = ? ";
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql = "UPDATE materia "
                + " SET "
                + " estado = 0 "
                + " WHERE idAlumno = ? "
                + " AND idMateria = ? ";
        
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        String sql = "SELECT * FROM inscripcion WHERE estado = 1 ";
        
        
        return null;
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
