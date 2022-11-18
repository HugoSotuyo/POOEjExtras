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

    private String[] palabra;
    private String[] palabraModificada;
    private int encontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraModificada, int encontradas, int intentos) {
        this.palabra = palabra;
        this.palabraModificada = palabraModificada;
        this.encontradas = encontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraModificada() {
        return palabraModificada;
    }

    public void setPalabraModificada(String[] palabraModificada) {
        this.palabraModificada = palabraModificada;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", palabraModificada=" + palabraModificada + ", encontradas=" + encontradas + ", intentos=" + intentos + '}';
    }

}
