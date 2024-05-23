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
//        
//        InscripcionData id1 = new InscripcionData();
//        
//        LocalDate fechaAlexis = LocalDate.of(2004, 12, 8);
//        Alumno alexis = new Alumno("Allendez", "Alexis", fechaAlexis, true);
//        Inscripcion inscripcionAlexis = new Inscripcion();
//        inscripcionAlexis.setAlumno(alexis);
//        inscripcionAlexis.setMateria(m3);
//        
//        LocalDate fechaEnzo = LocalDate.of(1997, 01, 6);
//        Alumno enzo = new Alumno("Casalegno", "Enzo", 
//                fechaEnzo, true, 23523);
//        Inscripcion inscripcionEnzo = new Inscripcion();
//        inscripcionEnzo.setAlumno(enzo);
//        inscripcionEnzo.setMateria(m3);
//        
//        
//        
//        LocalDate fechaNico = LocalDate.of(2002, 03, 8);
//        Alumno nico = new Alumno("Hollmann", "Nicolas", 
//                fechaEnzo, true, 2154);
//        Inscripcion inscripcionNico1 = new Inscripcion();
//        Inscripcion inscripcionNico2 = new Inscripcion();
//        inscripcionNico1.setAlumno(nico);
//        inscripcionNico2.setAlumno(nico);
//        inscripcionNico2.setNota(10);
//        inscripcionNico1.setMateria(m1);
//        inscripcionNico2.setMateria(m3);
//        
//        
//        id1.guardarInscripcion(inscripcionAlexis);
//        id1.guardarInscripcion(inscripcionEnzo);
//        id1.guardarInscripcion(inscripcionNico1);
//        id1.guardarInscripcion(inscripcionNico2);
//        
//        List<Inscripcion> inscripciones = new ArrayList<>();
//        inscripciones = id1.obtenerInscripciones();
//        System.out.println("-----------------------------------");
//        System.out.println("Inscripciones para todos!");
//        System.out.println("-----------------------------------");
//        for(Inscripcion inscripcion: inscripciones){
//            System.out.println(inscripcion);
//        }
//        
//        List<Inscripcion> inscripcionesNico = new ArrayList<>();
//        inscripcionesNico = id1.obtenerInscripcionesPorAlumno(nico.getIdAlumno());
//        System.out.println("-----------------------------------");
//        System.out.println("Las inscripciones de Nico");
//        System.out.println("-----------------------------------");
//        for(Inscripcion inscripcion: inscripcionesNico){
//            System.out.println(inscripcion);
//        }
//        
//        Materia ciberSeguridad = new Materia("Ciberseguridaad",
//                1, true);
//        md1.guardarMateria(ciberSeguridad);
//        
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
//                m3.getIdMateria(), 9);
//        System.out.println("----------------------------------------------------");
//        System.out.println("Hubo un error y resulta que Nico no saco un 10...");
//        System.out.println("Historial academico queda así ahora: ");
//        System.out.println("----------------------------------------------------");
//        for(Materia materia: materiasCursadasNico){
//            System.out.println(materia);
//        }
//        
//        List<Alumno> alumnosM3 = new ArrayList<>();
//        alumnosM3 = id1.obtenerAlumnosXMateria(m3.getIdMateria());
//        System.out.println("-------------------------------------------------");
//        System.out.println("Gente que está cursando " + m3.getNombre());
//        System.out.println("-------------------------------------------------");
//        for(Alumno alumno: alumnosM3){
//            System.out.println(alumno);
//        }
//        
//        
////////////////////////////
        
        
        
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
    }

}
