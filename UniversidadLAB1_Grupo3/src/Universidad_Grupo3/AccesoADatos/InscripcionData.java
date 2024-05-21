
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
    
    public void guardarInscripcion(Inscripcion insc){
        
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        
        return null;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        
        return null;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        
        return null;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
        
        return null;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        
        return null;
    }
    
    
}
