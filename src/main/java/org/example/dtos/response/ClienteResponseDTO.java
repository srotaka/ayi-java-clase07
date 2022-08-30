package org.example.dtos.response;

public class ClienteResponseDTO {

    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String ciudad;
    private Boolean isActive;

    public ClienteResponseDTO() {
        this.isActive = true;
    }
    public ClienteResponseDTO(String nombre, String apellido, String email, String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
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
        return "Cliente: " +
                "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Dirección: " + direccion +
                "\n\t- Ciudad: " + ciudad +
                "\n\t- Email: " + email +
                "\n\t- Cliente Activo: " + isActive;
    }
}
