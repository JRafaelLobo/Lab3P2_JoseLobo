package com.mycompany.lab3p2_josolobo;

public class Camion extends Vehiculo {

    private int volumen, altura;
    private boolean retroescabadora;

    public Camion() {
    }

    public Camion(int volumen, int altura, boolean retroescabadora) {
        this.volumen = volumen;
        this.altura = altura;
        this.retroescabadora = retroescabadora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroescabadora() {
        return retroescabadora;
    }

    public void setRetroescabadora(boolean retroescabadora) {
        this.retroescabadora = retroescabadora;
    }

    @Override
    public String toString() {
        return "Camion{" + "volumen=" + volumen + ", altura=" + altura + ", retroescabadora=" + retroescabadora + '}';
    }

}
