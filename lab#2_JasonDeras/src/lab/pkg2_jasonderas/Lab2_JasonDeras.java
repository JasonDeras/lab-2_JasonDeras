package lab.pkg2_jasonderas;

import java.util.*;

public class Lab2_JasonDeras {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        int contra = 0;
        String usuario = "";
        System.out.println("1- Registro de casas");
        System.out.println("2- Manejo de estados");
        System.out.println("3- Login");
        System.out.println("4.-Salir\n");
        System.out.println("Ingrese una opcion: ");
        int op = l.nextInt();
        String validacion = "" + op;
        while (validacion.charAt(0) != '3') {
            System.out.println("No puede ingresar sin antes login\n");
            System.out.print("Ingrese su usuario: ");
            usuario = l.next();
            System.out.print("Ingrese su contraseñ: ");
            contra = l.nextInt();
        }//Fin del while que valida la opcion
        if (op == 4) {
            System.exit(0);
        } else if (op == 3) {
            System.out.print("Ingrese su usuario: ");
            usuario = l.next();
            System.out.print("Ingrese su contraseñ: ");
            contra = l.nextInt();
            System.out.println("");
            System.out.println("Bienvenido "+usuario+"\n");
            System.out.println("1. Registro de casas");
            System.out.println("2. Manejo de estados");
        }//Fin del if del menu
    }//Fin del main

}//Fin de la clase del main
