package com.mycompany.lab3p2_josolobo;

public class Bus extends Vehiculo {

    private int pasajeros;
    private String tipo;

    public Bus() {
    }

    public Bus(int pasajeros) {
        setPasajeros(pasajeros);
    }

    public Bus(int pasajeros, String color, String marca, String modelo, int ano, double precio, int cantidad, String concesionario) {
        super(color, marca, modelo, ano, precio, cantidad, concesionario);
        setPasajeros(pasajeros);
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
        if (pasajeros <= 50) {
            tipo = "Rapidito";
        } else {
            tipo = "De Ruta";
        }
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    

}
