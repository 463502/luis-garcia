/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.proyectoFinal.Controladores;

import java.util.ArrayList;
import proyecto.entidades.*;

/**
 *
 * @author luis
 */
public class Control {

    private static ArrayList<Equipo> equipos = new ArrayList();
    private static ArrayList<Jugador> jugadores = new ArrayList();
    private static int gol = 0;
    private int TarjetaRoja;
    private int TarjetaAmrailla;
    private int TiroDeEsquina;

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static void setJugadores(ArrayList<Jugador> jugadores) {
        Control.jugadores = jugadores;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    /**
     *
     * @param equipos
     */
    public static void setEquipos(ArrayList<Equipo> equipos) {
        Control.equipos = equipos;
    }

    public static int getGol() {
        return gol;
    }

    public static void setGol(int aGol) {
        gol = aGol;
    }

    public void registrarGool(int id, int gool) {
        equipos.get(id).setGol(gol++);
    }

    public void registrarEquipo(String nombre, String id, int numeroJugadores, String color, ArrayList<Jugador> jugadores) {
        Equipo equipo = new Equipo(nombre, id, numeroJugadores, color, jugadores);

        equipos.add(equipo);
    }

    public void anadirJugadorEquipo(int id, Jugador jugador) {
        equipos.get(id).getJugadores().add(jugador);
    }

    public void añadirGool(int id) {
        int golesActuales = equipos.get(id).getGol();
        golesActuales++;
        equipos.get(id).setGol(golesActuales);
    }

    public void añadirTarjetaRoja(int id) {
        int TarjetaRojaActual = equipos.get(id).getTarjetaRoja();
        TarjetaRojaActual++;
        equipos.get(id).setTarjetaRoja(TarjetaRojaActual);
    }

    public void añadirTarjetaAmarilla(int id) {
        int TarjetaAmarillaActual = equipos.get(id).getTarjetaAmrailla();
        TarjetaAmarillaActual++;
        equipos.get(id).setTarjetaAmrailla(TarjetaAmarillaActual);
    }

    public void añadirTiroDeEsquina(int id) {
        int TiroDeEsquinaActual = equipos.get(id).getTiroDeEsquina();
        TiroDeEsquinaActual++;
        equipos.get(id).setTiroDeEsquina(TiroDeEsquinaActual);
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
