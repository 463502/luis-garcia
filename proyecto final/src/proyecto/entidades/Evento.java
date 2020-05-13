package proyecto.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

    ArrayList<Evento> evento;
    private Equipo equipo[];
    private Jugador jugador[];
    private String nota;
    private Date tiempo;

    public Evento(ArrayList<Evento> evento, Equipo[] equipo, Jugador[] jugador, String nota, Date tiempo) {
        this.evento = evento;
        this.equipo = equipo;
        this.jugador = jugador;
        this.nota = nota;
        this.tiempo = tiempo;
    }

    public Evento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Evento> getEvento() {
        return evento;
    }

    public void setEvento(ArrayList<Evento> evento) {
        this.evento = evento;
    }

    public boolean mostrar() {

        return true;
    }

    public Equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo[] equipo) {
        this.equipo = equipo;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Date getTimepo() {
        return tiempo;
    }

    public void setTiempo(Date timepo) {
        this.tiempo = timepo;
    }

}
