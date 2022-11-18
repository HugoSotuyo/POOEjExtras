/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;



import Entidad.Punto;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PuntoServicio {
   public Punto crearPuntos(Punto punto){
       
       Scanner leer = new Scanner (System.in);
       
       System.out.println("Ingrese la coordenada x1 ");
       punto.setX1(leer.nextDouble());
       System.out.println("Ingrese la coordenada x2 ");
       punto.setX2(leer.nextDouble());
       System.out.println("Ingrese la coordenada y1 ");
       punto.setY1(leer.nextDouble());
       System.out.println("Ingrese la coordenada y2 ");
       punto.setY2(leer.nextDouble());
       
     return punto;  
   }
   public double calcularDistancia(Punto punto){
       double distancia,dx,dy;
       dx=punto.getX2()-punto.getX1();
       dy=punto.getY2()-punto.getY1();
       distancia=sqrt(pow(dx,2)+pow(dy,2));
       return distancia;
   }
    
}
