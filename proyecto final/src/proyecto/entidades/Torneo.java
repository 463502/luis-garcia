
package proyecto.entidades;

import java.util.ArrayList;

/**
 *
 * @author koro
 */
public class Torneo {
    
    private String nombre;
    private String ano;
    private ArrayList<Equipo> equipos= new ArrayList();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    public Boolean registrarEquipo(){
        return true;
    }
}
