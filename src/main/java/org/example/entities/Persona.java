package org.example.entities;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer edad;
    protected String ciudad;
    protected Boolean isActive;

    public Persona(String nombre, String apellido, Integer edad, String ciudad, Boolean isActive) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
        this.isActive = true;
    }

    public Persona() {
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
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
                "\n\t- Edad: " + edad +
                "\n\t- Ciudad: " + ciudad;
    }
}
