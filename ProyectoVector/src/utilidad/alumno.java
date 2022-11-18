/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidad;

/**
 *
 * @author hdsot
 */
public class alumno {
    private int notas[];

    public alumno() {
        notas= new int[3]; //le ponemos dimension para evitar null por deborde
    }

    public alumno(int[] notas) {
        this.notas = notas;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    
    
}
