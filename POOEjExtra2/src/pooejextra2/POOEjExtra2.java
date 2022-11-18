/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra2;

import Entidad.Punto;
import Servicio.PuntoServicio;

/**
 *
 * @author hdsot
 */
public class POOEjExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoServicio puntoServ = new PuntoServicio();
        Punto punto = new Punto();
        puntoServ.crearPuntos(punto);
        System.out.println("La distancia entre ambos puntos es : "+
                puntoServ.calcularDistancia(punto)+" cm.");
    }
    
}
