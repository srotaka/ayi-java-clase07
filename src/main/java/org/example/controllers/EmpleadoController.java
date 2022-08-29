package org.example.controllers;

import org.example.dtos.EmpleadoDTO;
import org.example.services.IEmpleadoService;
import org.example.services.IPersonaService;
import org.example.services.impl.EmpleadoServiceImpl;

public class EmpleadoController {

    private IPersonaService iEmpleadoService = new EmpleadoServiceImpl();

    public void insertEmpleado(EmpleadoDTO empleadoDTO){
        iEmpleadoService.insert(empleadoDTO);
    }

    public void updateEmpleado(EmpleadoDTO empleadoDTO){
        iEmpleadoService.update(empleadoDTO);
    }

    public void getAllInfo(EmpleadoDTO empleadoDTO){
        iEmpleadoService.getAllInfo(empleadoDTO);
    }

    public void deleteEmpleado(EmpleadoDTO empleadoDTO){
        iEmpleadoService.delete(empleadoDTO);
    }
}
