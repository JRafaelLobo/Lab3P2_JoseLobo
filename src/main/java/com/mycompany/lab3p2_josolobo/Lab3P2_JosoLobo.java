package com.mycompany.lab3p2_josolobo;

import java.util.Scanner;

public class Lab3P2_JosoLobo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Opcion;
        System.out.println("""
                           -----------------------------------------------------
                           Menu
                           1. CRUD Concesionaria
                           2. CRUD Clientes
                           3. CRUD Vehículos.
                           4. Compra/Venta de vehículos por parte de un cliente
                           -----------------------------------------------------
                           Ingrese su Opcion:""");
        Opcion = leer.nextInt();
    }
}
