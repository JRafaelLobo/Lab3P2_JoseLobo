package com.mycompany.lab3p2_josolobo;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_JosoLobo {

    static ArrayList<Concesionaria> consecionarias = new ArrayList();

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();

        Scanner leer = new Scanner(System.in);
        int Opcion, idCliente = -1, IdVehiculos = -1, IdConse = -1;
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
                    System.out.println("""
                                       ----------------------
                                       1. Agregar Cliente
                                       2. Eliminar Cliente
                                       ---------------------
                                       Ingrese la Opcion:""");
                    switch (leer.nextInt()) {
                        case 1 -> {
                            System.out.println("Ingrese el Nombre: ");
                            String name = leer.next();
                            System.out.println("Ingrese el saldo: ");
                            int saldo = leer.nextInt();
                            Cliente C = new Cliente(idCliente, saldo, name);
                            idCliente++;
                            clientes.add(C);
                        }
                        case 2 -> {
                            System.out.println("Que cliente quiere Eliminar");
                            imprimirArrayList(clientes);
                            System.out.println("""
                                               ------------------------------
                                               Ingrese el id:""");
                            int id = leer.nextInt();
                            clientes.remove(id);
                        }
                    }
                }//case 2
                case 3 -> {
                    System.out.println("""
                                      ------------------------------
                                       Que desea hacer:
                                       1.Agregar Vehiculo
                                       2.Eliminar Vehculo
                                       -----------------------------
                                       Ingrese la Opcion""");
                    int opcion2 = leer.nextInt();
                    switch (opcion2) {

                        case 1 -> {
                            System.out.println("""
                                       -----------------------------------
                                       Que tipo de Vehiculo desea anadir:
                                       1. Carro
                                       2. Camion de Carga
                                       3. Bus
                                       4. Motocicleta
                                       5. Bicicleta
                                       -----------------------------------
                                       Ingrese Su Opcion:""");
                            int resp = leer.nextInt();
                            String[] temp = ModificarVehiculos();
                            switch (resp) {
                                case 1 -> {
                                    String[] temp2 = ModificarCarro();
                                    Carro C = new Carro(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), temp2[2], temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]), Integer.parseInt(temp[5]), temp[6]);
                                    vehiculos.add(C);
                                }//case 1
                                case 2 -> {
                                    String[] temp2 = ModificarCamion();
                                    Camion C = new Camion(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), Boolean.parseBoolean(temp2[2]), temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]), Integer.parseInt(temp[5]), temp[6]);
                                    vehiculos.add(C);
                                }//case 2
                                case 3 -> {
                                    System.out.println("Ingrese el numero maximo de Pacientes: ");
                                    Bus B = new Bus(leer.nextInt(), temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]), Integer.parseInt(temp[5]), temp[6]);
                                    vehiculos.add(B);
                                }//case 3
                                case 4 -> {
                                    String[] temp2 = ModificarMotocicleta();
                                    Motocicleta M = new Motocicleta(Integer.parseInt(temp2[0]), Boolean.parseBoolean(temp2[1]), temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]), Integer.parseInt(temp[5]), temp[6]);
                                    vehiculos.add(M);
                                }//case 4
                                case 5 -> {
                                    String[] temp2 = ModificarBicicleta();
                                    Bicicleta B = new Bicicleta(temp2[0], Integer.parseInt(temp2[1]), Boolean.parseBoolean(temp2[2]), temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]), Integer.parseInt(temp[5]), temp[6]);
                                    vehiculos.add(B);
                                }//case 5
                                default -> {
                                    System.out.println("Opcion Incorrecta... ");
                                }//case default
                            }//switch opcion 3
                        }
                        case 2 -> {
                            System.out.println("De que consecionaria ocupa eliminar:");
                            imprimirArrayList(consecionarias);
                            int a = leer.nextInt();
                            System.out.println("Que vehiculo ocupa eliminar");
                            for (int i = 0; i < consecionarias.get(a).getArrayVehiculos().size(); i++) {
                                System.out.println(i + ". " + consecionarias.get(a).getArrayVehiculos().get(i));
                            }
                            int b = leer.nextInt();
                            vehiculos.remove(consecionarias.get(a).getArrayVehiculos().get(b));
                            consecionarias.get(a).getArrayVehiculos().remove(b);
                        }
                    }
                }//case 3
                case 4 -> {

                }//case 4
                case 5 -> {
                    System.out.println("Saliendo...");
                }//case 5
                default -> {
                    System.out.println("Opcion Incorrecta...");
                }//case 6
            }//switch opcion
        } while (Opcion != 5);
    }//main

    public static String[] ModificarVehiculos() {
        String[] temp = new String[7];
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
        imprimirArrayList(consecionarias);
        System.out.println("Ingrese el Concesionario:");
        temp[6] = leer.next();
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
        System.out.println("Ingrese el numero de puertas:");
        temp[0] = leer.next();
        System.out.println("Ingrese la descripcion del motor:");
        Scanner lea = new Scanner(System.in);
        temp[1] = lea.nextLine();
        System.out.println("Ingrese la velocidad maxima:");
        temp[2] = leer.next();
        return temp;
    }

    public static String[] ModificarMotocicleta() {
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

    public static void imprimirArrayList(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(i + ". " + a.get(i));
        }

    }
}
