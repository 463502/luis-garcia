
package proyecto.entidades;

/**
 *
 * @author koro
 */
public class Usuario {
    
    private String nombre;
    private String Id;
    private String Contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    public Boolean LogIn(String nombre, String Contraseña){
        this.nombre= nombre;
        this.Contraseña=  Contraseña;
        return true;
    }
}

