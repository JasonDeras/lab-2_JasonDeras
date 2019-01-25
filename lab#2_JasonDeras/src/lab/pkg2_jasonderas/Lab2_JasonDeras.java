package lab.pkg2_jasonderas;

import java.util.*;

public class Lab2_JasonDeras {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList casas = new ArrayList();
        int contra = 0;
        String usuario = "";
        int op2 = 0;
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
            System.out.println("Bienvenido " + usuario + "\n");
            while (op2 != 3) {
                System.out.println("1. Registro de casas");
                System.out.println("2. Manejo de estados");
                System.out.println("3. Salir\n");
                System.out.println("Ingrese una opcion: ");
                int op3 = l.nextInt();
                switch (op3) {
                    case 1:
                        System.out.println("1.-Crear casa");
                        System.out.println("2.-Listar casa");
                        System.out.println("3.-Modificar casa");
                        System.out.println("4.-Eliminar casa");
                        System.out.print("Ingrese una opcion: ");
                        op2 = l.nextInt();
                        switch (op2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.print("Ingrese posicion de casa a eliminar: ");
                                int pos = l.nextInt();
                                casas.remove(pos);
                                break;
                        }//Fin del swrich del registro de casas}
                }//Fin del switch de llista de la casa
                if (op2 == 3) {
                    System.exit(0);
                }
            }//Fin del menu auxiliar
            if (op == 4) {
                System.exit(0);
            }
        }//Fin del if del menu
    }//Fin del main

}//Fin de la clase del main
