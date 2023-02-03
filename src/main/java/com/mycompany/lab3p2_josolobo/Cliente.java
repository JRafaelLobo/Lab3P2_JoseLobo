package com.mycompany.lab3p2_josolobo;

public class Cliente {

    private int id;
    private double saldo;
    private String nombre;

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

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", saldo=" + saldo + ", nombre=" + nombre + '}';
    }

}
