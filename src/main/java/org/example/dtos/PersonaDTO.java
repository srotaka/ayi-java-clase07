package org.example.dtos;

import java.util.StringJoiner;

public class PersonaDTO {

    protected String nombre;
    protected String apellido;
    protected String ciudad;
    protected Boolean isActive;

    public PersonaDTO(String nombre, String apellido, String ciudad, Boolean isActive) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.isActive = true;
    }

    public PersonaDTO() {
        this.isActive = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getActive() {return isActive;}

    public void setActive(Boolean active) {isActive = active;}

    @Override
    public String toString() {
        return  "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Ciudad: " + ciudad;
    }
}
