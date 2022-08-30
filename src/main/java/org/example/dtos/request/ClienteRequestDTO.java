package org.example.dtos.request;

public class ClienteRequestDTO {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String ciudad;
    private Boolean isActive;

    public ClienteRequestDTO() {
        this.isActive = true;
    }

    public ClienteRequestDTO(Integer idCliente, String nombre, String apellido, String email, String direccion, String ciudad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.isActive = true;
    }
    public Integer getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
        return "\n\tCliente: " +
                "\n\t\t~ ID: " + idCliente +
                "\n\t\t~ Nombre: " + nombre +
                "\n\t\t~ Apellido: " + apellido +
                "\n\t\t~ Dirección: " + direccion +
                "\n\t\t~ Ciudad: " + ciudad +
                "\n\t\t~ Email: " + email +
                "\n\t\t~ Cliente Activo: " + isActive;
    }
}
