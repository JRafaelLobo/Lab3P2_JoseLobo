package com.mycompany.lab3p2_josolobo;

public class Carro extends Vehiculo {

    private int puertas, velocidad;
    private String Descripcion;

    public Carro() {
    }

    public Carro(int puertas, int velocidad, String Descripcion) {
        this.puertas = puertas;
        this.velocidad = velocidad;
        this.Descripcion = Descripcion;
    }

    public Carro(int puertas, int velocidad, String Descripcion, String color, String marca, String modelo, int ano, int precio, int cantidad) {
        super(color, marca, modelo, ano, precio, cantidad);
        this.puertas = puertas;
        this.velocidad = velocidad;
        this.Descripcion = Descripcion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Carro{" + "puertas=" + puertas + ", velocidad=" + velocidad + ", Descripcion=" + Descripcion + '}';
    }

}
