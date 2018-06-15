
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelenriquesotocruz;

import java.util.Scanner;
import static java.lang.Math.random;
import java.util.*;
import java.util.stream.IntStream;

/**
 *
 * @author rafa
 */
public class menusDeOpciones {
    
    public static int menu_opciones(String nombre){
        Scanner sc2= new Scanner(System.in);
        
        System.out.println("<3 <3<3 <3 <3 <3 Menu de Razas <3 <3 <3 <3 <3 <3");
        System.out.println("1.Los Magiwaras.");
        System.out.println("2.Germa 66.");
        System.out.println("3.Baroque Works.");
        System.out.println(":3 :3 :3 :3:3 :3:3 :3:3 :3:3 :3:3 :3");
        System.out.println(nombre+" escoja una de las opciones:");
        int omr= sc2.nextInt();
        //int opra;
        int respuesta=validar_Raza(omr,nombre);
        return respuesta;
    }
    
    public static int validar_Raza(int opv,String nombrev){
        if(opv!=1 && opv!=2 && opv!=3){
            System.out.println(":c :c :c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c");
            System.out.println("|La opcion es incorrecta, porfavor escoja entre las opciones 1,2,3.|");
            System.out.println(":c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c :c:c ");
            int validado=menu_opciones(nombrev);
            validar_Raza(validado,nombrev);
            return validado;
        }
        return opv;
    }
    
    public static String conversor(String nombre){
        int opcion= menu_opciones(nombre);
        String tipo_Raza="";
        switch (opcion){
                case 1: 
                    tipo_Raza="Los Magiwaras";
                    break;
                                       
                case 2: 
                    tipo_Raza="Germa 66";
                    break;
                case 3: 
                    tipo_Raza="Baroque Works";
                    break;
            }
        return tipo_Raza;
    }
    
    public static Validaciones MenuDeGuerras(String nombre,int oro,int elixir,int madera){
        Scanner s=new Scanner(System.in);
        
        Validaciones validar= new Validaciones();
        System.out.println(">Menu de Guerra<");
        System.out.println("1.Construir Edificios.");
        System.out.println("2.Entrenar Ejercito.");
        System.out.println("3.Construir Vehiculo.");
        
        System.out.println(":v :v :v :v :v :v :v :v :v :v :v :v");
        System.out.println("Tus recursos "+nombre+" son:");
        System.out.println(":v Beri:"+oro+" :v akuma_no_mi:"+elixir+" :vMadera:"+madera+":v");
        System.out.println("------------------------------------");
        System.out.println(":v :v :v :v :v opciones de guerra :v :v :v :v :v");
        System.out.println("------------------------------------");
        System.out.println("4.atacar");
        System.out.println("5.defender");
        System.out.println("6.terminar turno");
        System.out.println("7.Rendirse");
        System.out.println(":3 :3 :3 :3 ");
        System.out.println(nombre+" escoja una de las opciones:");
        int op=s.nextInt();
        validar.menuGerra(op,nombre,oro,elixir,madera);
        System.out.println("");
        
        return validar;
        
    }
    
    public static Jugador Select_Aleatoria(Jugador nombre1,Jugador nombre2){
        int aleatorio = (int) (Math.random() * 2) + 1;
        Jugador nombre_f=new Jugador();
        if (aleatorio==1){
            nombre_f= nombre1;
                        
        }
        if(aleatorio==2){
            nombre_f= nombre2;
        }
        return nombre_f;
    }

    void MenuDeGuerra(String dueño, int Beri, int akuma_no_mi, int madera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
