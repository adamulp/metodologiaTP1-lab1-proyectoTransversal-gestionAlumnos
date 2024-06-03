
package Universidad_Grupo3.Entidades;

import java.util.Objects;

/**
 *
 * @author Hollmann
 */
public class Materia {
    
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean activo;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idMateria;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + this.anioMateria;
        hash = 37 * hash + (this.activo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        if (this.anioMateria != other.anioMateria) {
            return false;
        }
        if (this.activo != other.activo) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
}
