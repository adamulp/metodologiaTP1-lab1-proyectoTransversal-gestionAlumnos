
package universidadlab1_grupo3;

import Universidad_Grupo3.AccesoADatos.*;
import Universidad_Grupo3.Entidades.*;
import java.time.LocalDate;

/**
 *
 * @author Hollmann
 */
public class UniversidadLAB1_Grupo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlumnoData ad = new AlumnoData();
        LocalDate fecha =  LocalDate.of(2003,02,04);
        
        Alumno alu = new Alumno( "Allendez","Alexis",fecha,true);
       
       ad.guardarAlumno(alu);
//      Alumno alu2 = ad.buscarAlumno(5);
      
   
//        if (alu2 == null) {
//                System.out.println(alu2);
//        }
    }
    
}
