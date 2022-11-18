/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovector;

import servicio.alumnoServicio;
import utilidad.alumno;

/**
 *
 * @author hdsot
 */
public class ProyectoVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alumno alumno1= new alumno();
        alumnoServicio alum=new alumnoServicio();
        System.out.println("Ingrese las 3 notas del alumno");
        alum.ingresarNotas(alumno1);
        alum.mostrarNotas(alumno1);
        alum.promedio(alumno1);
    }
    
}
