package com.mycompany.lab3p2_josolobo;

import java.util.Scanner;

public class Lab3P2_JosoLobo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Opcion;
        do {
            System.out.println("""
                           -----------------------------------------------------
                           Menu
                           1. CRUD Concesionaria
                           2. CRUD Clientes
                           3. CRUD Vehículos.
                           4. Compra/Venta de vehículos por parte de un cliente
                           5. Salir
                           -----------------------------------------------------
                           Ingrese su Opcion:""");
            Opcion = leer.nextInt();
            switch (Opcion) {
                case 1 -> {

                }//case 1
                case 2 -> {

                }//case 2
                case 3 -> {

                }//case 3
                case 4 -> {

                }//case 4
                case 5 -> {
                    System.out.println("Saliendo...");
                }//case 5
                default -> {
                    System.out.println("Opcion Incorrecta");
                }//case 6
            }//switch opcion
        } while (Opcion != 5);
    }//main

    public static String[] ModificarVehiculos() {
        String[] temp = new String[6];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Color:");
        temp[0] = leer.next();
        System.out.println("Ingrese la Marca:");
        temp[1] = leer.next();
        System.out.println("Ingrese la Modelo:");
        temp[2] = leer.next();
        System.out.println("Ingrese la Ano:");
        temp[3] = leer.next();
        System.out.println("Ingrese la Precio:");
        temp[4] = leer.next();
        System.out.println("Ingrese la Cantidad:");
        temp[5] = leer.next();
        return temp;
    }

    public static String[] ModificarCamion() {
        String[] temp = new String[3];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el volumen máximo de carga,:");
        temp[0] = leer.next();
        System.out.println("Ingrese la altura:");
        temp[1] = leer.next();
        System.out.println("Tiene retroescavadora[1.Si][2.no]:");
        if (leer.nextInt() == 1) {
            temp[2] = "true";
        } else {
            temp[2] = "false";
        }
        return temp;
    }

    public static String[] ModificarCarro() {
        String[] temp = new String[3];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de puertas,:");
        temp[0] = leer.next();
        System.out.println("Ingrese la descripcion del motor:");
        temp[1] = leer.nextLine();
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese la velocidad maxima:");
        temp[2] = lea.next();
        return temp;
    }

    public static String[] ModificarMoticicleta() {
        String[] temp = new String[2];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el desplazamiento del motor:");
        temp[0] = leer.next();
        System.out.println("Ingrese si es electrica:");
        temp[1] = leer.next();
        return temp;
    }

    public static String[] ModificarBicicleta() {
        String[] temp = new String[4];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la descripcion:");
        temp[0] = leer.nextLine();
        Scanner lea = new Scanner(System.in);
        System.out.println("Es electrica");
        temp[1] = lea.next();
        System.out.println("Ingrese el radio de la rueda");
        temp[2] = lea.next();
        System.out.println("Es BMX[1.Si][2.no]:");
        if (lea.nextInt() == 1) {
            temp[3] = "true";
        } else {
            temp[3] = "false";
        }
        return temp;
    }
}
