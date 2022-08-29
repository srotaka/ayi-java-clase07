package org.example.dtos;

public class EmpleadoDTO extends PersonaDTO {
    private Integer id;
    private Double sueldo;
    private String departamento;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(String nombre, String apellido, String ciudad, Boolean isActive, Integer id, Double sueldo, String departamento) {
        super(nombre, apellido, ciudad, isActive);
        this.id = id;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Empleado: " +
                "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Ciudad: " + ciudad +
                "\n\t- Sueldo: USD " + sueldo +
                "\n\t- Departamento: " + departamento;
    }
}
