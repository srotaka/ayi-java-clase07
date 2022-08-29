package org.example.entities;

import java.util.StringJoiner;

public class Cliente extends Persona {

    private Integer idCliente;
    private String email;
    private String direccion;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, Integer edad, String ciudad, Boolean isActive, Integer idCliente, String email, String direccion) {
        super(nombre, apellido, edad, ciudad, isActive);
        this.idCliente = idCliente;
        this.email = email;
        this.direccion = direccion;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "\n\t- ID: " + idCliente +
                "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Edad: " + edad + " años" +
                "\n\t- Direeción: " + direccion +
                "\n\t- Ciudad: " + ciudad +
                "\n\t- Email: " + email;
    }
}
