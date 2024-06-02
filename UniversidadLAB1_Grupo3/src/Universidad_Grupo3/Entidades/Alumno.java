
package Universidad_Grupo3.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Hollmann
 */
public class Alumno {
    
    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean activo;
    private int dni;

    public Alumno() {
    }

    
    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }
    
    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean activo, int dni) {
        this(apellido, nombre, fechaNac, activo);
        this.dni = dni;
    }

    
    
    public int getIdAlumno() {
        return idAlumno;
    }

    public int getDni() {
        return dni;
    } 
    
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

      
    
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    

    @Override
    public String toString() {
        if(idAlumno == -1){
            return "";
        }
        return apellido + ", " + nombre;
    }
    
    
    
}
