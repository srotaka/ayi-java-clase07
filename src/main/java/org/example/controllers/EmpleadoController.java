package org.example.controllers;

import org.example.dtos.request.EmpleadoRequestDTO;
import org.example.services.IEmpleadoService;
import org.example.services.impl.EmpleadoServiceImpl;

import java.util.List;

public class EmpleadoController {

    private IEmpleadoService empleadoService = new EmpleadoServiceImpl();

    public void insertEmpleado(EmpleadoRequestDTO empleadoRequestDTO){

        empleadoService.insertEmpleado(empleadoRequestDTO);
    }

    public void updateEmpleado(Integer id, EmpleadoRequestDTO empleadoRequestDTO){

        empleadoService.updateEmpleado(id, empleadoRequestDTO);
    }

    public void getAllInfoFromEmpleados(List<EmpleadoRequestDTO> listEmpleados){

        empleadoService.getAllInfoFromEmpleados(listEmpleados);
    }

    public void deleteEmpleado(Integer id, EmpleadoRequestDTO empleadoRequestDTO){

        empleadoService.deleteEmpleado(id, empleadoRequestDTO);
    }

}
