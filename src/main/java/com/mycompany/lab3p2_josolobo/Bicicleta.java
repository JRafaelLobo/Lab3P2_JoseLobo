package com.mycompany.lab3p2_josolobo;

public class Bicicleta {

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
        return "Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", BMX=" + BMX + '}';
    }

}
