package lab.pkg2_jasonderas;

import java.util.*;

public class Lab2_JasonDeras {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList casas = new ArrayList();
        int contra = 0;
        String usuario = "";
        int op2 = 0;
        String dueño;
        String estado;
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
                        System.out.println("4.-Eliminar casa\n");
                        System.out.print("Ingrese una opcion: ");
                        op2 = l.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.print("Ingrese numero de casa: ");
                                int cas = l.nextInt();
                                System.out.print("Ingrese numero de bloque");
                                int bloque = l.nextInt();
                                System.out.print("Ingrese ancho:");
                                int ancho = l.nextInt();
                                System.out.print("Ingrese largo: ");
                                int largo = l.nextInt();
                                System.out.print("Ingrese estado: ");
                                estado = l.next();
                                System.out.print("Ingrese cantidad de pisos: ");
                                int pisos = l.nextInt();
                                System.out.print("Ingrese cantidad de baños: ");
                                int baños = l.nextInt();
                                System.out.print("Ingrese cantidad de cuartos: ");
                                int cuartos = l.nextInt();
                                if (estado.equalsIgnoreCase("vendida")) {
                                    System.out.print("Ingrese dueño en caso que la casa este comprada: ");
                                    dueño = l.next();
                                } else {
                                    dueño = "";
                                }//If que valida si la casa comprada
                                System.out.print("Ingrese nombre del ingeniro a cargo de la casa: ");
                                String ing = l.next();
                                casas.add(new Casas(cas, bloque, ancho, largo, estado, pisos, baños, cuartos, dueño));
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 2:
                                for (int i = 0; i < casas.size(); i++) {
                                    System.out.println(casas.get(i));
                                }//Fin del for que imprime la lista de las casas
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Ingrese posicion a modificar: ");
                                int pos = l.nextInt();
                                System.out.println("");
                                System.out.println("");
                                break;
                            case 4:
                                System.out.print("Ingrese posicion de casa a eliminar: ");
                                pos = l.nextInt();
                                casas.remove(pos);
                                System.out.println("");
                                System.out.println("");
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
