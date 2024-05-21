
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
    
    public void guardarMatera(Materia materia){
        
    }
    
    public Materia buscarMateria(int id){
        
        return null;
    }
    
    public void modificarMateria(Materia materia){
        
    }
    
    public void eliminarMateria(int id){
        
    }
    
    public List<Materia> listarMaterias(){
        
        return null;
    }
    
    
}
