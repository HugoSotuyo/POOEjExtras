/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooahorcado;
import Servicio.AhorcadoServicio;
import Utilidad.Ahorcado;
import java.util.Scanner;
/**
 *
 * @author hdsot
 */
public class POOAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letra;
        Ahorcado juego;
        boolean bandera;
        int longitud;
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio ahorcServ = new AhorcadoServicio();

        juego = ahorcServ.crearJuego();
        longitud = ahorcServ.longitud(juego.getPalabrabuscada());

        do {
            System.out.println("Ingrese letra");
            letra = leer.next();
            ahorcServ.buscar(letra, juego.getPalabrabuscada(), juego.getIntentos());
            ahorcServ.intentos(juego.getIntentos() - 1);
            juego.setIntentos(juego.getIntentos() - 1);
            bandera = ahorcServ.encontradas(letra, juego.getPalabrabuscada(), juego.getPalabramodificada(), juego.getLetrasencont(), juego.getIntentos());
            if (bandera == true) {
                System.out.println("felicitaciones, encontro la palabra");
                juego.setIntentos(0);
            }
        } while (juego.getIntentos() > 0); //&& juego.getLetrasencont()<=longitud);
    }
}
