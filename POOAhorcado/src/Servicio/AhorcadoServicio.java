/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Utilidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class AhorcadoServicio {
    Ahorcado juego = new Ahorcado();
    public Ahorcado crearJuego() {
        String palabra;
        int cantJugadas, cantLetras;
        String[] palabra1;
        String[] palabranueva;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra a buscar");
        palabra = leer.nextLine();
        System.out.println("Ingrese la cantidad de intentos permitidos");
        cantJugadas = leer.nextInt();
        cantLetras = palabra.length();
        palabra1 = new String[cantLetras];//vector con la palabra a buscar
        palabranueva = new String[cantLetras];//vector que almacena los aciertos
        /*
        Cargo los dosvectores
         */
        for (int i = 0; i < cantLetras; i++) {
            palabra1[i] = palabra.substring(i, i + 1);
            palabranueva[i] = "_";
        }

        Ahorcado juego1 = new Ahorcado(0, cantJugadas, palabra1, palabranueva);
        return juego1;
    }
    public int longitud(String[] palabra) {
        int longitud;
        longitud = palabra.length;
        System.out.println("Longitud de la palabra: " + longitud);
        return longitud;
    }
    public void buscar(String letra, String[] palabra, int intentos) {
        int encontradas = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra) && !palabra[i].equalsIgnoreCase("#")) {
                encontradas = encontradas + 1;
            }
        }
        if (encontradas != 0) {
            System.out.println("La letra pertenece a la palabra buscada");
        } else {
            System.out.println("La letra NO pertence a la palabra buscada");
        }
    }
    public boolean encontradas(String letra, String[] palabra, String[] palabraModif, int encontradas, int intentos) {
        boolean bandera = false;
        int faltantes;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase(letra) && !palabra[i].equalsIgnoreCase("#")) {
                juego.setLetrasencont(juego.getLetrasencont() + 1);
                palabraModif[i] = letra;
                palabra[i] = "#";
            }
        }
        faltantes = palabra.length - juego.getLetrasencont();
        System.out.println("Se encontraron " + juego.getLetrasencont() + " letras");
        System.out.println("Restan encontrar " + faltantes);
        juego.setPalabramodificada(palabraModif);
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(" [ " + palabraModif[i] + " ]");

        }
        System.out.println("");
        if (faltantes == 0) {
            bandera = true;
        }
        return bandera;
    }
    public void intentos(int intentos) {
        System.out.println("Le quedan " + intentos + " Intentos");
    }
}
