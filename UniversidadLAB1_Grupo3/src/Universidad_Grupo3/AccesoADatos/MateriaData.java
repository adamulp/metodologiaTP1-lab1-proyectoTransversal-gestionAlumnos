
package Universidad_Grupo3.AccesoADatos;

/**
 *
 * @author lab1 C2 grupo3
 */

import Universidad_Grupo3.AccesoADatos.Conexion;
import java.sql.Connection;
import Universidad_Grupo3.Entidades.Materia;
import java.util.List;

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
    
    public void guardarMatera(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado) "
                + " VALUES (?, ?, ?)";
        
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT "
                + "idMateria, nombre, año, "
                + "FROM materia"
                + "WHERE idMateria = ? AND estado = 1";
        
        return null;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia "
                + " SET "
                + " idMateria = ? ,"
                + " nombre = ? , "
                + " año = ?  "
                + " WHERE idMateria =  ?";

        
    }
    
    public void eliminarMateria(int id){
        String sql = "UPDATE materia "
                + " SET "
                + " estado = 0 "
                + " WHERE idMateria = ?";
        
    }
    
    public List<Materia> listarMaterias(){
        String sql = "SELECT * FROM materia WHERE estado = 1 ";
        
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