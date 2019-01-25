package lab.pkg2_jasonderas;

import java.awt.Color;

public class Casas {

    //Atributos de la clase de casas
    private int casa;
    private int bloque;
    private Color c = Color.white;
    private int ancho;
    private int largo;
    private String estado;
    private int pisos;
    private int baños;
    private int cuartos;
    private String dueño;
    private String ing;

    public Casas() {
    }//Constructor vacio

    public Casas(int n_c, int n_b, int ancho, int largo, String estado, int pisos, int baños, int cuartos, String dueño, String inge) {
        casa = n_c;
        bloque = n_b;
        this.ancho = ancho;
        this.largo = largo;
        this.estado = estado;
        this.pisos = pisos;
        this.baños = baños;
        this.cuartos = cuartos;
        this.dueño = dueño;
        ing = inge;
    }//Constructro con los parametros

    public void setNum_c(int n_c) {
        this.casa = n_c;
    }//Mutador set del numero de casa

    public void setbloque(int n_b) {
        this.bloque = n_b;
    }//Metador set del numero de bloque

    public int getnum_() {
        return casa;
    }//Mutador que get el numero de la casa

    public int getn_b() {
        return bloque;
    }//Mutaodr que get el numero de bloque de la casa

    public void Ancho(int ancho) {
        this.ancho = ancho;
    }//Mutador set del ancho de casa

    public void setlargo(int largo) {
        this.largo = largo;
    }//Metador set del largo de la casa

    public int getlargo() {
        return largo;
    }//Mutador que get de el largo de la casa

    public int getancho() {
        return ancho;
    }//Mutaodr que get el ancho de la casa

    public void setestado(String estado) {
        this.estado = estado;
    }//Mutador set del estado de casa

    public void setpisos(int pisos) {
        this.pisos = pisos;
    }//Metador set del numero de pisos de la casa

    public String getestado() {
        return estado;
    }//Mutador que get del estado de la casa

    public int getpisos() {
        return pisos;
    }//Mutaodr que get el numero de pisos de la casa

    public void setbaños(int baños) {
        this.baños = baños;
    }//Mutador set del numero de baños de la casa

    public void setcuartos(int cuartos) {
        this.cuartos = cuartos;
    }//Metador set del numero de cuartos de la casa

    public int getcuartos_() {
        return cuartos;
    }//Mutador que get el numero de curatods de la casa

    public int getbaños() {
        return baños;
    }//Mutaodr que get el numero de baños de la casa

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }//Fin del mutador set del dueño de la casa si esta vendida

    public String getDueño() {
        return dueño;
    }//Fin del mutador get del dueño de la casa si esta venidad

    public void setIng(String inge) {
        ing = inge;
    }//Fin del mutaodr set del ing de la casa

    public String getIng() {
        return ing;
    }//Fin del mutador set del ingeniero de la casa

    public String toString() {
        return "Numero de casa= " + casa
                + " Numero de bloque= " + bloque
                + " Color= " + c
                + " Ancho= " + ancho
                + " Estado= " + estado
                + " Numero de pisos= " + pisos
                + " Numero de baños= " + baños
                + " Numero de cuartos= " + cuartos
                + " Dueño= " + dueño
                + " Ingeniero acarogo de la casa= " + ing;
    }//Fin del metodo to String
}//Fin de la clase de las casas
