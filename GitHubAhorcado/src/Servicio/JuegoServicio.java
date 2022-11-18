/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Utilidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class JuegoServicio {
    Ahorcado juego=new Ahorcado();
    
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar palabra a adivinar");
        String p=leer.next();
        String[] v=new String[p.length()];
        String[] v1=new String[p.length()];
        for (int i = 0; i < p.length(); i++) {
            v[i]=p.substring(i, i+1);
            v1[i]="_";
        }
        System.out.println("Ingresar cantidad de intentos máximos");
        int i=leer.nextInt();
        Ahorcado juego1=new Ahorcado(v,v1,0,i);
        return juego1;
    }
    
    public void longitud(Ahorcado juego){
        String[] vector=juego.getPalabra();
        System.out.println("La palabra contiene "+vector.length+" letras");
    }
    
    public void buscar(Ahorcado juego, String letra){
        String[] vector=juego.getPalabraModificada();
        String[] vector1=juego.getPalabra();
        boolean bandera=false;
        for (int i = 0; i < vector.length; i++) {
            if (vector1[i].equals(letra)) {
                bandera=true;
                juego.setEncontradas(juego.getEncontradas()+1);
                vector[i]=letra;
            } 
        }
        juego.setPalabraModificada(vector);
        juego.setIntentos(juego.getIntentos()-1);
        if (bandera) {
            System.out.println("La lera está en la palabra");
        } else {
            System.out.println("La letra no está en la palabra");
        }
        System.out.println(Arrays.toString(juego.getPalabraModificada()));
        System.out.println("las letras encontradas son: "+juego.getEncontradas()+"; Las letras a encontrar son: "+(vector.length-juego.getEncontradas()));
        System.out.println("Te quedan "+juego.getIntentos()+" intentos");
    }
}
    

