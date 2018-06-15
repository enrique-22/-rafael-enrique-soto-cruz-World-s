/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelenriquesotocruz;

/**
 *
 * @author rafa
 */

import static java.lang.Math.random;
import java.util.*;
import java.util.stream.IntStream;


public class rafaelenriquesotocruzworld {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Jugador player1=new Jugador();
        Jugador player2=new Jugador();
                
        
        int oro=10000;
        int elixir=3000;
        int madera=5000;
        int vida1 = 1000,vida2=1000;
        int oro2=10000;
        int elixir2=3000;
        int madera2=5000;
        
  
        
        
        ArrayList Islas = new ArrayList();
        
        

        
                
        Scanner sc= new Scanner(System.in);
	    
	System.out.println(":3 :3 :3 :3 :3 :3 :3 :3 :3 :3 :3 :3 :3 :3 :3 :3 ");
	System.out.println("|                 Bienvenido                   |");
	System.out.println("<3 <3 <3 <3  <3 <3  <3 <3  <3 <3 <3 <3 <3 <3  <3");
	System.out.println("");
	System.out.println(">> ingrese su nombre Jugador 1:");
	String dog1=sc.nextLine(); 
        
        Jugador jugador= new Jugador();
        jugador.nombre=dog1;
        
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println(">> ingrese su nombre Jugador 2:");
	String dog2=sc.nextLine(); 
        
        Jugador jugador2= new Jugador();
        jugador2.nombre=dog2;
        
	System.out.println("-----------------------------------------------");
	System.out.println("");
	//System.out.println("mono2 es: "+mono2);
        menusDeOpciones opcion=new menusDeOpciones();
                
	jugador.raza=opcion.conversor(jugador.nombre);
	jugador2.raza=opcion.conversor(jugador2.nombre);
        System.out.println("-----------------------------------------------");
        System.out.println(jugador.nombre+" su raza es "+jugador.raza);
        System.out.println("-----------------------------------------------");
        System.out.println(jugador2.nombre+" su raza es "+jugador2.raza);
        System.out.println("-----------------------------------------------");
        player1=opcion.Select_Aleatoria(jugador,jugador2);
        if (player1==jugador){
            player2=jugador2;
        }
        if (player1==jugador2){
            player2= jugador;
        }
        System.out.println("player1: "+player1.nombre+" raza: "+player1.raza);
        System.out.println("player2: "+player2.nombre+" raza: "+player2.raza);
        
        Centro_de_comando CdC1=new Centro_de_comando();
        Centro_de_comando CdC2=new Centro_de_comando();
        CdC1.dueño=player1.nombre;
        CdC1.akuma_no_mi=elixir;
        CdC1.madera=madera;
        CdC1.Beri=oro;
        CdC1.vida= vida1;
        
        CdC2.dueño=player2.nombre;
        CdC2.akuma_no_mi=elixir2;
        CdC2.madera=madera2;
        CdC2.Beri=oro2;
        CdC2.vida= vida2;
        
      
        
        while(true){
            opcion.MenuDeGuerras(CdC1.dueño,CdC1.Beri,CdC1.akuma_no_mi,CdC1.madera);
            opcion.MenuDeGuerras(CdC2.dueño,CdC2.Beri,CdC2.akuma_no_mi,CdC2.madera);
           
        }
    }
    
    
}
