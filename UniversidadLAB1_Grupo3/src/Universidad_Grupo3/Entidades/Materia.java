
package Universidad_Grupo3.Entidades;

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

        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anioMateria=" + anioMateria + ", activo=" + activo + '}';
    }
    
    
}
