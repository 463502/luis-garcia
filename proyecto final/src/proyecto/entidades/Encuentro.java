
package proyecto.entidades;

import java.util.Date;
public class Encuentro {
    
    private Equipo equipos[];
    private double duracion;
    private Date tiempo;

    public Encuentro(Equipo[] equipos, double duracion, Date tiempo) {
        this.equipos = equipos;
        this.duracion = duracion;
        this.tiempo = tiempo;
    }
    
    public boolean registrarEquipos(){
        this.equipos = equipos;

        return true;
    }
    
    public boolean empezar(){
        
        return true;
    }
    
    public boolean finalizar(){
        
        return true;
    }
    
    public boolean mostrarMarcador(){
        
        return true;
    }
    
    public boolean actualizarMarcador(){
        
        return true;
    }
    
    public boolean mostrarGanador(){
        
        return true;
    }
    
    public boolean mostrarRendimiento(){
        
        return true;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }
}
