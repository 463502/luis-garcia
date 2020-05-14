package proyecto.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

    private String evento;
    private String equipo;
    private String jugador;
    private String nota;
    private String tiempo;

    public Evento(String evento, String equipo, String jugador, String nota, String tiempo) {
        this.evento = evento;
        this.equipo = equipo;
        this.jugador = jugador;
        this.nota = nota;
        this.tiempo = tiempo;
    }

    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public boolean mostrar() {

        return true;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getTimepo() {
        return tiempo;
    }

    public void setTiempo(String timepo) {
        this.tiempo = timepo;
    }

}
