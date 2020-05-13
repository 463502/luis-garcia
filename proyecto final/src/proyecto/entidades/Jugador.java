/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package futbol;  esto es lo que tu tenias

package proyecto.entidades;//tiene que ir asi

/**
 *
 * @author Usuario Final
 */
public class Jugador {
    
    private String nombre;
    private String apellido;
    private String apodo;
    private int numero;
    private String posicion;
    private String equipo;

    public Jugador(String nombre, String apellido, String apodo, int numero, String posicion, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.numero = numero;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Jugador() {
    }
    
    
    public boolean Jugar (){
        return true;
    }
    
    public boolean Banca(){
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
