package lab.pkg2_jasonderas;

import java.awt.Color;

public class Casas {

    int casa;
    int bloque;
    Color c = Color.white;
    int ancho;
    int largo;
    String estado;
    int pisos;
    int baños;
    int cuartos;
    String dueño;

    public Casas() {
    }//Constructor vacio

    public Casas(int n_c, int n_b, int ancho, int largo, String estado, int pisos, int baños, int cuartos, String dueño) {
        casa = n_c;
        bloque = n_b;
        this.ancho = ancho;
        this.largo = largo;
        this.estado = estado;
        this.pisos = pisos;
        this.baños = baños;
        this.cuartos = cuartos;
        this.dueño = dueño;
    }//Constructro con los parametros

    public String toString() {
        return "Numero de casa= " + casa
                + " Numero de bloque= " + bloque
                + " Color= " + c
                + " Ancho= " + ancho
                + " Estado= " + estado
                + " Numero de pisos= " + pisos
                + " Numero de baños= " + baños
                + " Numero de cuartos= " + cuartos
                + " Dueño= " + dueño;
    }//Fin del metodo to String
}//Fin de la clase de las casas
