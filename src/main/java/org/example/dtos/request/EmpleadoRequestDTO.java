package org.example.dtos.request;

public class EmpleadoRequestDTO {

    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private String ciudad;
    private Double sueldo;
    private String departamento;
    private Boolean isActive;

    public EmpleadoRequestDTO() {
        this.isActive = true;
    }
    public EmpleadoRequestDTO(Integer idEmpleado, String nombre, String apellido, String ciudad, Double sueldo, String departamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.sueldo = sueldo;
        this.departamento = departamento;
        this.isActive = true;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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
        return "\n\tEmpleado: " +
                "\n\t\t~ ID: " + idEmpleado +
                "\n\t\t~ Nombre: " + nombre +
                "\n\t\t~ Apellido: " + apellido +
                "\n\t\t~ Ciudad: " + ciudad +
                "\n\t\t~ Sueldo: US$ " + sueldo +
                "\n\t\t~ Departamento: " + departamento +
                "\n\t\t~ Empleado Activo: " + isActive;
    }
}
