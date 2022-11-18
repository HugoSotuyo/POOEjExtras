/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;
import utilidad.alumno;

/**
 *
 * @author hdsot
 */
public class alumnoServicio {
    public void ingresarNotas(alumno alumno1){
        
        int notas[]= new int[3];
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            notas[i]=leer.nextInt();
            
        }
        alumno1.setNotas(notas);
    }
    public void mostrarNotas(alumno alumno1){
        int[]notas=alumno1.getNotas();
        for (int i = 0; i < 3; i++) {
            System.out.print(" ["+notas[i]+"] ");
        }
        System.out.println("");
    }
    public double promedio(alumno alumno1){
        double promedio;
        int[]notas=alumno1.getNotas();
        promedio=(notas[0]+notas[1]+notas[2])/3;
        return promedio;
    }
   
}
