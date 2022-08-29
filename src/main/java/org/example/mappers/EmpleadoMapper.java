package org.example.mappers;

import org.example.dtos.EmpleadoDTO;
import org.example.entities.Empleado;

public class EmpleadoMapper {

    public Empleado dtoToEntity(EmpleadoDTO dto, Empleado empleado){

        empleado.setNombre(dto.getNombre());
        empleado.setApellido(dto.getApellido());
        empleado.setCiudad(dto.getCiudad());
        empleado.setDepartamento(dto.getDepartamento());
        empleado.setSueldo(dto.getSueldo());
        return empleado;
    }

    public EmpleadoDTO entityToDto(Empleado empleado, EmpleadoDTO dto){

        dto.setNombre(empleado.getNombre());
        dto.setApellido(empleado.getApellido());
        dto.setCiudad(empleado.getCiudad());
        dto.setDepartamento(empleado.getDepartamento());
        dto.setSueldo(empleado.getSueldo());
        return dto;
    }
}
