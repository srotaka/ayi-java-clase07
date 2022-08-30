package org.example.services;

import org.example.dtos.request.EmpleadoRequestDTO;

import java.util.List;

public interface IEmpleadoService {
    void insertEmpleado(EmpleadoRequestDTO empleadoRequestDTO);
    void updateEmpleado(Integer id, EmpleadoRequestDTO empleadoRequestDTO);
    void getAllInfoFromEmpleados(List<EmpleadoRequestDTO> listEmpleados);
    void deleteEmpleado(Integer id, EmpleadoRequestDTO empleadoRequestDTO);
}
