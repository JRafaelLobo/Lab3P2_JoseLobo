package com.mycompany.lab3p2_josolobo;

public class Bus {

    private int pasajeros;
    private String tipo;

    public Bus() {
    }

    public Bus(int pasajeros) {
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

}
