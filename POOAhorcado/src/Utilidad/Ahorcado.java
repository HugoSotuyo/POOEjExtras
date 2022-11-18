/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidad;

/**
 *
 * @author hdsot
 */
public class Ahorcado {
    private int letrasencont,intentos;
    private String[]palabrabuscada;
    private String[]palabramodificada;

    public Ahorcado() {
    }

    public Ahorcado(int letrasencont, int intentos, String[] palabrabuscada, String[] palabramodificada) {
        this.letrasencont = letrasencont;
        this.intentos = intentos;
        this.palabrabuscada = palabrabuscada;
        this.palabramodificada = palabramodificada;
    }

    public int getLetrasencont() {
        return letrasencont;
    }

    public void setLetrasencont(int letrasencont) {
        this.letrasencont = letrasencont;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String[] getPalabrabuscada() {
        return palabrabuscada;
    }

    public void setPalabrabuscada(String[] palabrabuscada) {
        this.palabrabuscada = palabrabuscada;
    }

    public String[] getPalabramodificada() {
        return palabramodificada;
    }

    public void setPalabramodificada(String[] palabramodificada) {
        this.palabramodificada = palabramodificada;
    }
}
