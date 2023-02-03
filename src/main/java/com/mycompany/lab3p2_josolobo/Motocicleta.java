package com.mycompany.lab3p2_josolobo;

public class Motocicleta extends Vehiculo {

    private int desplazamiento;
    private boolean electrica;

    public Motocicleta() {
    }

    public Motocicleta(int desplazamiento, boolean electrica) {
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }

    public Motocicleta(int desplazamiento, boolean electrica, String color, String marca, String modelo, int ano, double precio, int cantidad, String concesionario) {
        super(color, marca, modelo, ano, precio, cantidad, concesionario);
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }

}
