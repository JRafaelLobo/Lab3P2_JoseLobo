package com.mycompany.lab3p2_josolobo;

public class Bicicleta extends Vehiculo {

    String descripcion;
    double radio;
    boolean BMX;

    public Bicicleta() {
    }

    public Bicicleta(String descripcion, double radio, boolean BMX) {
        this.descripcion = descripcion;
        this.radio = radio;
        this.BMX = BMX;
    }

    public Bicicleta(String descripcion, double radio, boolean BMX, String color, String marca, String modelo, int ano, double precio, int cantidad, String concesionario) {
        super(color, marca, modelo, ano, precio, cantidad, concesionario);
        this.descripcion = descripcion;
        this.radio = radio;
        this.BMX = BMX;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public boolean isBMX() {
        return BMX;
    }

    public void setBMX(boolean BMX) {
        this.BMX = BMX;
    }

    @Override
    public String toString() {
        return super.toString() + "Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", BMX=" + BMX + '}';
    }

}
