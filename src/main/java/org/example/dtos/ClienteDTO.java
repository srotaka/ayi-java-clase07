package org.example.dtos;

public class ClienteDTO extends PersonaDTO{

    private Integer id;
    private String direccion;
    private String email;

    public ClienteDTO() {

    }

    public ClienteDTO(String nombre, String apellido, String ciudad, Boolean isActive, Integer id, String direccion, String email) {
        super(nombre, apellido, ciudad, isActive);
        this.id = id;
        this.direccion = direccion;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Dirección: " + direccion +
                "\n\t- Ciudad: " + ciudad +
                "\n\t- Email: " + email;
    }
}
