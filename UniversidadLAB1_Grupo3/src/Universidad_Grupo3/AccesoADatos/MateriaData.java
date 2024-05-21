
package Universidad_Grupo3.AccesoADatos;

/**
 *
 * @author lab1 C2 grupo3
 */

import Universidad_Grupo3.AccesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Universidad_Grupo3.Entidades.Materia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {
    
    private Connection con = null;
    
    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    /*
CREATE TABLE IF NOT EXISTS `materia` (
`idMateria` int(11) NOT NULL,
`nombre` varchar(100) NOT NULL,
`año` int(11) NOT NULL,
`estado` tinyint(1) NOT NULL,
PRIMARY KEY (`idMateria`),
UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci; 
    */
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado) "
                + " VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            // ps.setInt, ps.setString, ps.setDate, ps.setBoolean, etc.
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,
                            "Materia guardada con exito. ");
            }else {
                JOptionPane.showMessageDialog(null, "rs.next()==false ");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT "
                + "idMateria, nombre, año, "
                + "FROM materia"
                + "WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
  
            ResultSet rs = ps.executeQuery();
              
            if (rs.next()) {
                
            }else {
                JOptionPane.showMessageDialog(null, "rs.next()==false ");
                ps.close();
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        
        return null;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia "
                + " SET "
                + " idMateria = ? ,"
                + " nombre = ? , "
                + " año = ?  "
                + " WHERE idMateria =  ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            // ps.setInt, ps.setString, ps.setDate, ps.setBoolean, etc.
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el coso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        
    }
    
    public void eliminarMateria(int id){
        String sql = "UPDATE materia "
                + " SET "
                + " estado = 0 "
                + " WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            // ps.setInt, ps.setString, ps.setDate, ps.setBoolean, etc.
            
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el coso ");
            }else {
                JOptionPane.showMessageDialog(null, "fila != 1 ");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        
    }
    
    public List<Materia> listarMaterias(){
        String sql = "SELECT * FROM materia WHERE estado = 1 ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
  
            ResultSet rs = ps.executeQuery();
              
            while(rs.next()){
             // rs.getInt, rs.getString, rs.getDate, etc.
           }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        
        return null;
    }
    
    
}
    /*
CREATE TABLE IF NOT EXISTS `materia` (
`idMateria` int(11) NOT NULL,
`nombre` varchar(100) NOT NULL,
`año` int(11) NOT NULL,
`estado` tinyint(1) NOT NULL,
PRIMARY KEY (`idMateria`),
UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci; 
    */