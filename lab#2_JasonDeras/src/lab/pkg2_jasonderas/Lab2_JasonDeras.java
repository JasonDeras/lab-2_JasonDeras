package lab.pkg2_jasonderas;

import java.util.*;

public class Lab2_JasonDeras {

    static Scanner l = new Scanner(System.in);
    static String dueño;
    static String estado;
    static String ing;

    public static void main(String[] args) {
        ArrayList casas = new ArrayList();
        ArrayList casas_listas = new ArrayList();
        ArrayList casas_construccion = new ArrayList();
        ArrayList casas_construccion_en_espera = new ArrayList();
        ArrayList casas_espera_de_demolicion = new ArrayList();
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
                                System.out.print("Ingrese estado(puede usar _ para simular un espacio): ");
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
                                    dueño = "No tiene dueño";
                                }//If que valida si la casa comprada
                                if (estado.equalsIgnoreCase("lista")) {
                                    casas_listas.add(1);
                                } else if (estado.equalsIgnoreCase("construccion")) {
                                    if (casas_construccion.size() == 4) {
                                        System.out.println("Ya no se pueden poner mas casas en estado de construccion");
                                    } else {
                                        casas_construccion.add(1);
                                    }
                                } else if (estado.equalsIgnoreCase("construccion_es_espera")) {
                                    casas_construccion_en_espera.add(1);
                                } else if (estado.equalsIgnoreCase("espera_en_demolicion")) {
                                    if (casas_espera_de_demolicion.size() == 2) {
                                        System.out.println("Ya no se puede agregar mas casa en estado de espera de demolicion");
                                    } else {
                                        casas_espera_de_demolicion.add(1);
                                    }
                                } else {
                                    System.out.println("Esatado de casa no valido\n");
                                }//Fin del if que valida y agrega el estado de cada casa
                                System.out.print("Ingrese nombre del ingeniero a cargo de la casa: ");
                                ing = l.next();
                                casas.add(new Casas(cas, bloque, ancho, largo, estado, pisos, baños, cuartos, dueño, ing));
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
                                System.out.print("Ingrese numero de casa: ");
                                cas = l.nextInt();
                                System.out.print("Ingrese numero de bloque");
                                bloque = l.nextInt();
                                System.out.print("Ingrese ancho:");
                                ancho = l.nextInt();
                                System.out.print("Ingrese largo: ");
                                largo = l.nextInt();
                                System.out.print("Ingrese cantidad de pisos: ");
                                pisos = l.nextInt();
                                System.out.print("Ingrese cantidad de baños: ");
                                baños = l.nextInt();
                                System.out.print("Ingrese cantidad de cuartos: ");
                                cuartos = l.nextInt();
                                if (estado.equalsIgnoreCase("vendida")) {
                                    System.out.print("Ingrese dueño en caso que la casa este comprada: ");
                                    dueño = l.next();
                                } else {
                                    dueño = "No tiene dueño";
                                }//If que valida si la casa comprada
                                System.out.println("Ingrese el ingeniero responsable de la obra: ");
                                ing = l.next();
                                if (casas.get(pos) instanceof Casas) {
                                    ((Casas) casas.get(pos)).setlargo(largo);
                                    ((Casas) casas.get(pos)).setDueño(dueño);
                                    ((Casas) casas.get(pos)).setNum_c(cas);
                                    ((Casas) casas.get(pos)).setbaños(baños);
                                    ((Casas) casas.get(pos)).setIng(ing);
                                    ((Casas) casas.get(pos)).setbloque(bloque);
                                    ((Casas) casas.get(pos)).setcuartos(cuartos);
                                    ((Casas) casas.get(pos)).setpisos(pisos);
                                    ((Casas) casas.get(pos)).setancho(ancho);
                                }//Fin del if que modicica los aspectos de cada casa
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
