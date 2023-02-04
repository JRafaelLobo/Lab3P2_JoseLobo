package com.mycompany.lab3p2_josolobo;

import java.util.ArrayList;

public class Cliente {

    private int id;
    private double saldo;
    private String nombre;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();

    public Cliente(int id, double saldo, String nombre) {
        this.id = id;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addVehiculo(Vehiculo a) {
        vehiculos.add(a);
    }

    public void removeVehiculo(Vehiculo a) {
        vehiculos.remove(a);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", saldo=" + saldo + ", nombre=" + nombre + '}';
    }

}
