package com.mycompany.lab3p2_josolobo;

public class Vehiculo {

    protected String color, marca, modelo, concesionario;
    protected int ano, cantidad;
    protected double precio;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, String modelo, int ano, double precio, int cantidad, String concesionario) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        setPrecio(precio);
        this.cantidad = cantidad;
        this.concesionario = concesionario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getConcesionario() {
        return concesionario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

}
