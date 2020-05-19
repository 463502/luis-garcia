/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.proyectoFinal.Controladores;

import java.util.ArrayList;
import proyecto.entidades.Equipo;
import proyecto.entidades.Jugador;

/**
 *
 * @author luis
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Control control = new Control();
            Equipo equipo = new Equipo();
            Jugador jugador = new Jugador();
            Jugador jugador2 = new Jugador();
            Jugador jugador3 = new Jugador();
            Jugador jugador4 = new Jugador();
            
            String color = "rojo";
            String id = "0";
            String nombre = "Chivas";
            int numJuga = 11;
            
            String nombrej="Luis";
            String apellido="Garcia";
            String apodo="koro";
            int numero=13;
            String posicion="defensa";
            
            jugador.setNombre(nombrej);
            jugador.setApellido(apellido);
            jugador.setApodo(apodo);
            jugador.setNumero(numero);
            jugador.setPosicion(posicion);
            
            String nombrej1="Francisco";
            String apellido1="Garcia";
            String apod1o="Fran";
            int numero1=11;
            String posicion1="Portero";
            
            jugador2.setNombre(nombrej1);
            jugador2.setApellido(apellido1);
            jugador2.setApodo(apod1o);
            jugador2.setNumero(numero1);
            jugador2.setPosicion(posicion1);
            
            ArrayList <Jugador> jugadores = new ArrayList ();
            
            control.registrarEquipo(nombre, id, numJuga, color, jugadores);
            
            control.anadirJugadorEquipo(0, jugador);
            
            
            String color1 = "amarillo";
            String id1 = "1";
            String nombre1 = "America";
            int numJuga1 = 10;
            
            control.registrarEquipo(nombre1, id1, numJuga1, color1, jugadores);
            control.anadirJugadorEquipo(1, jugador2);
            
            for(int i=0; i < Control.getEquipos().size(); i++){
                System.out.println("Nombre Equipo "+Control.getEquipos().get(i).getNombre());
                for(int b =0; b<Control.getEquipos().get(i).getJugadores().size(); b++){
                    System.out.println("Nombre Jugador " + Control.getEquipos().get(i).getJugadores().get(b).getNombre());
                }
            }
    }
    
}
