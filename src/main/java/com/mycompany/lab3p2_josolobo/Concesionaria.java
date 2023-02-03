package com.mycompany.lab3p2_josolobo;

import java.util.ArrayList;

public class Concesionaria {

    String nombre, direccion;
    int id;
    double saldo;
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();

    public Concesionaria() {
    }

    public Concesionaria(String nombre, String direccion, int id, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addCliente(Cliente a) {
        clientes.add(a);
    }

    public void addVehiculo(Vehiculo a) {
        vehiculos.add(a);
    }

    public void delVehiculo(Vehiculo a) {
        vehiculos.remove(a);
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", direccion=" + direccion + ", id=" + id + ", saldo=" + saldo + ", vehiculos=" + vehiculos + ", clientes=" + clientes + '}';
    }

}
