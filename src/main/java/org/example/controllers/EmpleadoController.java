package org.example.controllers;

import org.example.dtos.EmpleadoDTO;
import org.example.services.IPersonaService;
import org.example.services.impl.EmpleadoServiceImpl;

public class EmpleadoController {

    private IPersonaService empleadoService = new EmpleadoServiceImpl();

    public void insertEmpleado(EmpleadoDTO empleadoDTO){

        empleadoService.insert(empleadoDTO);
    }

    public void updateEmpleado(EmpleadoDTO empleadoDTO){
        empleadoService.update(empleadoDTO);
    }

    public void getAllInfo(EmpleadoDTO empleadoDTO){
        empleadoService.getAllInfo(empleadoDTO);
    }

    public void deleteEmpleado(EmpleadoDTO empleadoDTO){
        empleadoService.delete(empleadoDTO);
    }
}
