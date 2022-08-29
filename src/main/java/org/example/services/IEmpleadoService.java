package org.example.services;

import org.example.dtos.EmpleadoDTO;
import org.example.entities.Empleado;

public interface IEmpleadoService {

    void insertEmpleado(EmpleadoDTO empleadoDTO);
    void updateEmpleado(EmpleadoDTO empleadoDTO);
    void getAllInfo(EmpleadoDTO empleadoDTO);
    void deleteEmpleado(EmpleadoDTO empleadoDTO);

}
