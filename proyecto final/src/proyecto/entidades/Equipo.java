/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package futbol;  esto es lo que tu tenias

package proyecto.entidades;//tiene que ir asi

import java.util.ArrayList;
//import futbol.Jugador;

/**
 *
 * @author Usuario Final
 */
public class Equipo {
    
    private String nombre;
    private String id;
    private int numeroJugadores;
    private String color;

    public Equipo(String nombre, String id, int numeroJugadores, String color) {
        this.nombre = nombre;
        this.id = id;
        this.numeroJugadores = numeroJugadores;
        this.color = color;
    }
     
    public boolean Jugar(){
        return true;
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

}
