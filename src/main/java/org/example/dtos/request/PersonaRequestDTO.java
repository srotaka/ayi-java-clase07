package org.example.dtos.request;

public class PersonaRequestDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private String ciudad;
    private Boolean isActive;

    public PersonaRequestDTO() {
        this.isActive = true;
    }

    public PersonaRequestDTO(Integer id, String nombre, String apellido, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.isActive = true;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return  "\n\tPersona: " +
                "\n\t\t~ ID: " + id +
                "\n\t\t~ Nombre: " + nombre +
                "\n\t\t~ Apellido: " + apellido +
                "\n\t\t~ Ciudad: " + ciudad;
    }
}
