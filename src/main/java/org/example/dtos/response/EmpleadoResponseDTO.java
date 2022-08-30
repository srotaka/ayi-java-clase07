package org.example.dtos.response;

public class EmpleadoResponseDTO {

    private String nombre;
    private String apellido;
    private String ciudad;
    private Double sueldo;
    private String departamento;
    private Boolean isActive;

    public EmpleadoResponseDTO() {
        this.isActive = true;
    }
    public EmpleadoResponseDTO(String nombre, String apellido, String ciudad, Double sueldo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.sueldo = sueldo;
        this.departamento = departamento;
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

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
    @Override
    public String toString() {
        return "Empleado: " +
                "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Ciudad: " + ciudad +
                "\n\t- Sueldo: USD " + sueldo +
                "\n\t- Departamento: " + departamento +
                "\n\t- Empleado Activo: " + isActive;
    }
}
