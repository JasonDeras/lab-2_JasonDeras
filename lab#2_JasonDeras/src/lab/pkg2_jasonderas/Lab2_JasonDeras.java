package lab.pkg2_jasonderas;

import java.util.*;

public class Lab2_JasonDeras {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        int contra=0;
        String usuario="";
        System.out.println("1- Registro de casas");
        System.out.println("2- Manejo de estados");
        System.out.println("3- Login");
        System.out.println("4.-Salir");
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
        switch(op)
        {}
        ystem.out.println(contra);
        System.out.println(usuario);
    }//Fin del main

}//Fin de la clase del main
