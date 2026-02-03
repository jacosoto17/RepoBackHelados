package com.jaco.heladeria.Modelos;

public class Usuario {

    private String nombre;
    private int id;
    private String email;
    private String contraseña;
    private String telefono;

    public Usuario(String nombre,int id, String email, String contraseña, String telefono){
        this.nombre=nombre;
        this.id=id;
        this.email=email;
        this.contraseña=contraseña;
        this.telefono=telefono;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
