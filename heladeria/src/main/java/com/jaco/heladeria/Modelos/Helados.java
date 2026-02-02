package com.jaco.heladeria.Modelos;

public class Helados {

    private int id;
    private String sabor;
    private double precio;

    public Helados(int id, String sabor, double precio){
        this.id=id;
        this.sabor=sabor;
        this.precio=precio;
    }

    public Helados() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
