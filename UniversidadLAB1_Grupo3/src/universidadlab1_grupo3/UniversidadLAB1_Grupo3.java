package universidadlab1_grupo3;

import Universidad_Grupo3.AccesoADatos.*;
import Universidad_Grupo3.Entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
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
        
/*
---------------------------- Pruebas de AlumnoData ------------------------------------------------
*/ 
        
        
        
//        AlumnoData ad = new AlumnoData();
//        LocalDate fechaAlexis = LocalDate.of(2004, 12, 8);
//        LocalDate fechaEnzo = LocalDate.of(1997, 01, 6);
//
//        Alumno alexis = new Alumno("Allendez", "Alexis", fechaAlexis, true);
//
////        ad.guardarAlumno(alexis);
////        Alumno alu1 = ad.buscarAlumno(alexis.getIdAlumno());
////
////        if (alu1 != null) {
////            System.out.println(alu1);
////        }
//        alexis = ad.buscarAlumno(16);
//        
//        
////        Alumno enzo = new Alumno("Casalegno", "Enzo", 
////                fechaEnzo, true, 23523);
////        ad.guardarAlumno(enzo);
////        Alumno buscarAlEnzo = ad.buscarAlumnoPorDni(23523);
////
////        if (buscarAlEnzo != null) {
////            System.out.println("buscarAlEnzo=" + buscarAlEnzo);
////        }
//        
//
//        
//        alexis.setDni(34523652);
//        
//        ad.modificarAlumno(alexis);
//        
//        ad.guardarAlumno(new Alumno ("Hollmann", "Nicolas",
//              LocalDate.of(2002, 3, 6), true,
//                2154)
//        );
//        
//        
//        
//        
//        // Agregamos un alumno y lo eliminamos
//        
//        Alumno adam = new Alumno("Rig", "Ada", LocalDate.of(1969, 12,8),
//        true, 236346);
//        ad.guardarAlumno(adam);
//        adam = ad.buscarAlumnoPorDni(236346);
//        
//        
//        List<Alumno> lista1 = ad.listarAlumnos();
//        System.out.println("----------------------------------------");
//        System.out.println("En un tiempo antes de borrar alumnos...");
//        for(int i=0; i < lista1.size(); i++){
//            System.out.println(lista1.get(i));
//        }
//        System.out.println("----------------------------------------");
//        
//        ad.eliminarAlumno(adam.getIdAlumno());
//        
//        List<Alumno> lista2 = ad.listarAlumnos();
//        System.out.println("----------------------------------------");
//        System.out.println("Después de borrar alumnos...");
//        for(int i=0; i < lista2.size(); i++){
//            System.out.println(lista2.get(i));
//        }
//        System.out.println("----------------------------------------");
//
        /*
---------------------------- Pruebas de MateriaData ------------------------------------------------
         */
        
//        MateriaData md1 = new MateriaData();
//        Materia m1 = new Materia("IA", 1, true);
//        Materia m2 = new Materia();
//        Materia m3 = new Materia("Comprension de texto",2,true);
//        List<Materia> listaMaterias = new ArrayList<>();
//        
//        
//
//        md1.guardarMateria(m1);
//
//        m2 = md1.buscarMateria(m2.getIdMateria());
//        System.out.println(m2);
//        
//        m1.setNombre("Programacion");
//        md1.modificarMateria(m1);
//        
//        m2 = md1.buscarMateria(m1.getIdMateria());
//        System.out.println(m2);
//        
//        md1.guardarMateria(m3);
//        
//     //   md1.eliminarMateria(m3.getIdMateria());
//        
//     
//        listaMaterias=md1.listarMaterias();
//        
//        for (Materia listaMateria : listaMaterias) {
//            System.out.println(listaMateria);
//        }

/*
---------------------------- Pruebas de InscripcionData ------------------------------------------------
*/      

        

        MateriaData md1 = new MateriaData();
        Materia metodologia = new Materia("Metodologia de Desarrollo", 1, true);
        Materia ingles = new Materia("Ingles", 2, true);
        Materia robotica = new Materia("Robotica",3,true);
        
        Materia ciberSeguridad = new Materia("Ciberseguridaad",
        1, true);
        md1.guardarMateria(ciberSeguridad);
        md1.guardarMateria(robotica);
        md1.guardarMateria(ingles);
        md1.guardarMateria(metodologia);
        
        List<Materia> listaMaterias = new ArrayList<>();

        InscripcionData id1 = new InscripcionData();
        
        LocalDate fechaAlexis = LocalDate.of(2004, 12, 8);
        Alumno alexis = new Alumno("Allendez", "Alexis", fechaAlexis, true);
        AlumnoData alumnoData = new AlumnoData();
        alumnoData.guardarAlumno(alexis);
        Inscripcion inscripcionAlexis = new Inscripcion();
        inscripcionAlexis.setAlumno(alexis);
        inscripcionAlexis.setMateria(metodologia);
        
        LocalDate fechaEnzo = LocalDate.of(1997, 01, 6);
        Alumno enzo = new Alumno("Casalegno", "Enzo", 
                fechaEnzo, true, 23523);
        alumnoData.guardarAlumno(enzo);
        Inscripcion inscripcionEnzo = new Inscripcion();
        inscripcionEnzo.setAlumno(enzo);
        inscripcionEnzo.setMateria(metodologia);
        
         
        // Pruebas de guardarInscripcion
        
        LocalDate fechaNico = LocalDate.of(2002, 03, 8);
        Alumno nico = new Alumno("Hollmann", "Nicolas", 
                fechaEnzo, true, 2154);
        alumnoData.guardarAlumno(nico);
        Inscripcion inscripcionNico1 = new Inscripcion();
        Inscripcion inscripcionNico2 = new Inscripcion();
        inscripcionNico1.setAlumno(nico);
        inscripcionNico2.setAlumno(nico);
        inscripcionNico2.setNota(10);
        inscripcionNico1.setMateria(robotica);
        inscripcionNico2.setMateria(ingles);
        
        inscripcionAlexis.getAlumno().setIdAlumno(1);
        inscripcionAlexis.getMateria().setIdMateria(4);
        
        inscripcionEnzo.getAlumno().setIdAlumno(2);
        inscripcionEnzo.getMateria().setIdMateria(4);
        
        inscripcionNico1.getAlumno().setIdAlumno(3);
        inscripcionNico1.getMateria().setIdMateria(2);
                
        inscripcionNico2.getAlumno().setIdAlumno(3);
        inscripcionNico2.getMateria().setIdMateria(3);
        
        System.out.println("-----------------------------------------------");
        System.out.println("inscripcionNico1");
        System.out.println("-----------------------------------------------");
        System.out.println("idMateria=" + inscripcionNico1.getMateria().getIdMateria());
        System.out.println("idAlumno=" + inscripcionNico1.getAlumno().getIdAlumno());
        id1.guardarInscripcion(inscripcionAlexis);
        id1.guardarInscripcion(inscripcionEnzo);
        id1.guardarInscripcion(inscripcionNico1);
        id1.guardarInscripcion(inscripcionNico2);
        
        // Pruebas de obtenerInscripciones
        List<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones = id1.obtenerInscripciones();
        System.out.println("-----------------------------------");
        System.out.println("Pruebas de obtenerInscripciones()!");
        System.out.println("-----------------------------------");
        
        if(inscripciones == null){
            System.out.println("No hay inscripciones");
        }else{
            for(Inscripcion inscripcion: inscripciones){
                System.out.println(inscripcion);
            }
        }
        
        // Pruebas de obtenerInscripcionesPorAlumno
        List<Inscripcion> inscripcionesNico = new ArrayList<>();
        inscripcionesNico = id1.obtenerInscripcionesPorAlumno(nico.getIdAlumno());
        System.out.println("-----------------------------------");
        System.out.println("Las inscripciones de Nico");
        System.out.println("-----------------------------------");
        if(inscripciones == null){
            System.out.println("Nico no esta inscripto en ninguna materia");
        }else{
            for(Inscripcion inscripcion: inscripcionesNico){
                System.out.println(inscripcion);
            }
        }
        

        
//        List<Materia> materiasCursadasNico = new ArrayList<>();
//        List<Materia> materiasNoCursadasNico = new ArrayList<>();
//        materiasCursadasNico = id1.obtenerMateriasCursadas(nico.getIdAlumno());
//        materiasNoCursadasNico = id1.obtenerMateriasNOCursadas(nico.getIdAlumno());
//        
//        System.out.println("----------------------------------------------------");
//        System.out.println("Materias que está cursando Nico (por nombre y todo):");
//        System.out.println("----------------------------------------------------");
//        for(Materia materia: materiasCursadasNico){
//            System.out.println(materia);
//        }
//        System.out.println("----------------------------------------------------");
//        System.out.println("Materias que no está cursando Nico (por nombre):");
//        System.out.println("----------------------------------------------------");
//        for(Materia materia: materiasNoCursadasNico){
//            System.out.println(materia);
//        }
//        
//        id1.borrarInscripcionMateriaAlumno(nico.getIdAlumno(),
//                ciberSeguridad.getIdMateria());
//        System.out.println("----------------------------------------------------");
//        System.out.println("Materias que está cursando Nico (por nombre y todo):");
//        System.out.println("----------------------------------------------------");
//        for(Materia materia: materiasCursadasNico){
//            System.out.println(materia);
//        }
//        
//        id1.actualizarNota(nico.getIdAlumno(),
//                robotica.getIdMateria(), 9);
//        System.out.println("----------------------------------------------------");
//        System.out.println("Hubo un error y resulta que Nico no saco un 10...");
//        System.out.println("Historial academico queda así ahora: ");
//        System.out.println("----------------------------------------------------");
//        for(Materia materia: materiasCursadasNico){
//            System.out.println(materia);
//        }
//        
//        List<Alumno> alumnosM3 = new ArrayList<>();
//        alumnosM3 = id1.obtenerAlumnosXMateria(metodologia.getIdMateria());
//        System.out.println("-------------------------------------------------");
//        System.out.println("Gente que está cursando " + metodologia.getNombre());
//        System.out.println("-------------------------------------------------");
//        for(Alumno alumno: alumnosM3){
//            System.out.println(alumno);
//        }
        

    }

}
