/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package futbol;  esto es lo que tu tenias
package proyecto.entidades;//tiene que ir asi

import java.util.ArrayList;
import proyecto.entidades.Jugador;

/**
 *
 * @author Usuario Final
 */
public class Equipo {

    Jugador jugador = new Jugador();
    private String nombre;
    private String id;
    private int numeroJugadores;
    private String color;
    private int gol;
    private int TarjetaRoja;
    private int TarjetaAmrailla;
    private int TiroDeEsquina;

    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo() {

    }

    public Equipo(String nombre, String id, int numeroJugadores, String color, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.id = id;
        this.numeroJugadores = numeroJugadores;
        this.color = color;
    }

    public boolean Jugar() {
        return true;
    }

    public void registrar(ArrayList<Jugador> jugadores) {

        this.jugadores.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getTarjetaRoja() {
        return TarjetaRoja;
    }

    public void setTarjetaRoja(int TarjetaRoja) {
        this.TarjetaRoja = TarjetaRoja;
    }

    public int getTarjetaAmrailla() {
        return TarjetaAmrailla;
    }

    public void setTarjetaAmrailla(int TarjetaAmrailla) {
        this.TarjetaAmrailla = TarjetaAmrailla;
    }

    public int getTiroDeEsquina() {
        return TiroDeEsquina;
    }

    public void setTiroDeEsquina(int TiroDeEsquina) {
        this.TiroDeEsquina = TiroDeEsquina;
    }

}
