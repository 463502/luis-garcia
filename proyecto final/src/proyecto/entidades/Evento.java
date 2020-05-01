package proyecto.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

    ArrayList<Evento> evento;
    private Equipo equipo[];
    private Jugador jugador[];
    private String nota;

    public ArrayList<Evento> getEvento() {
        return evento;
    }

    public void setEvento(ArrayList<Evento> evento) {
        this.evento = evento;
    }
    private Date timepo;

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
        return timepo;
    }

    public void setTimepo(Date timepo) {
        this.timepo = timepo;
    }

}
