package universidadlab1_grupo3;

import Universidad_Grupo3.AccesoADatos.*;
import Universidad_Grupo3.Entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        LocalDate fechaAlexis = LocalDate.of(2004, 12, 8);
        LocalDate fechaEnzo = LocalDate.of(1997, 01, 6);

        Alumno alexis = new Alumno("Allendez", "Alexis", fechaAlexis, true);

//        ad.guardarAlumno(alexis);
//        Alumno alu1 = ad.buscarAlumno(alexis.getIdAlumno());
//
//        if (alu1 != null) {
//            System.out.println(alu1);
//        }
        alexis = ad.buscarAlumno(16);
        
        
//        Alumno enzo = new Alumno("Casalegno", "Enzo", 
//                fechaEnzo, true, 23523);
//        ad.guardarAlumno(enzo);
//        Alumno buscarAlEnzo = ad.buscarAlumnoPorDni(23523);
//
//        if (buscarAlEnzo != null) {
//            System.out.println("buscarAlEnzo=" + buscarAlEnzo);
//        }
        

        
        alexis.setDni(34523652);
        
        ad.modificarAlumno(alexis);
        
        ad.guardarAlumno(new Alumno ("Hollmann", "Nicolas",
              LocalDate.of(2002, 3, 6), true,
                2154)
        );
        
        
        
        
        // Agregamos un alumno y lo eliminamos
        
        Alumno adam = new Alumno("Rig", "Ada", LocalDate.of(1969, 12,8),
        true, 236346);
        ad.guardarAlumno(adam);
        adam = ad.buscarAlumnoPorDni(236346);
        
        
        List<Alumno> lista1 = ad.listarAlumnos();
        System.out.println("----------------------------------------");
        System.out.println("En un tiempo antes de borrar alumnos...");
        for(int i=0; i < lista1.size(); i++){
            System.out.println(lista1.get(i));
        }
        System.out.println("----------------------------------------");
        
        ad.eliminarAlumno(adam.getIdAlumno());
        
        List<Alumno> lista2 = ad.listarAlumnos();
        System.out.println("----------------------------------------");
        System.out.println("Después de borrar alumnos...");
        for(int i=0; i < lista2.size(); i++){
            System.out.println(lista2.get(i));
        }
        System.out.println("----------------------------------------");

    }

}
