package org.example.entities;

public class Empleado extends Persona {

    private Integer idEmpleado;
    private Double sueldo;
    private String departamento;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Integer edad, String ciudad, Boolean isActive, Integer idEmpleado, Double sueldo, String departamento) {
        super(nombre, apellido, edad, ciudad, isActive);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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
                "\n\t- ID: " + idEmpleado +
                "\n\t- Nombre: " + nombre +
                "\n\t- Apellido: " + apellido +
                "\n\t- Edad: " + edad + " años" +
                "\n\t- Ciudad: " + ciudad +
                "\n\t- Sueldo: USD " + sueldo +
                "\n\t- Departamento: " + departamento;
    }

}
