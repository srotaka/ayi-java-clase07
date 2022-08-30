package org.example.services.impl;

import org.example.dtos.request.EmpleadoRequestDTO;
import org.example.dtos.response.EmpleadoResponseDTO;
import org.example.services.IEmpleadoService;
import org.example.utilities.DatosRandom;

import java.util.List;

public class EmpleadoServiceImpl implements IEmpleadoService {

    DatosRandom datosRandom = new DatosRandom();

    @Override
    public void insertEmpleado(EmpleadoRequestDTO empleadoRequestDTO) {
        EmpleadoResponseDTO responseDTO = new EmpleadoResponseDTO();

        responseDTO.setNombre(empleadoRequestDTO.getNombre());
        responseDTO.setApellido(empleadoRequestDTO.getApellido());
        responseDTO.setCiudad(empleadoRequestDTO.getCiudad());
        responseDTO.setDepartamento(empleadoRequestDTO.getDepartamento());
        responseDTO.setSueldo(empleadoRequestDTO.getSueldo());

        System.out.println("\nInsertando datos del Empleado:" +
                "\n\t- ID Empleado: " + empleadoRequestDTO.getIdEmpleado() +
                "\n\t- Nombre: " + responseDTO.getNombre() +
                "\n\t- Apellido: " + responseDTO.getApellido() +
                "\n\t- Ciudad: " + responseDTO.getCiudad() +
                "\n\t- Puesto: " + responseDTO.getDepartamento() +
                "\n\t- Sueldo: US$ " + responseDTO.getSueldo());

    }

    @Override
    public void updateEmpleado(Integer id, EmpleadoRequestDTO empleadoRequestDTO) {
        EmpleadoResponseDTO responseDTO = new EmpleadoResponseDTO();

        if(empleadoRequestDTO.getActive() != false) {

            empleadoRequestDTO.setDepartamento(datosRandom.sectorRandom());
            empleadoRequestDTO.setSueldo(datosRandom.sueldoRandom());

            System.out.println("\nModificando datos del Empleado:" +
                    "\n\t- ID Empleado: " + empleadoRequestDTO.getIdEmpleado() +
                    "\n\t- Nombre: " + empleadoRequestDTO.getNombre() +
                    "\n\t- Apellido: " + empleadoRequestDTO.getApellido() +
                    "\n\t- Puesto: " + empleadoRequestDTO.getDepartamento() +
                    "\n\t- Sueldo: US$ " + empleadoRequestDTO.getSueldo());
        } else {
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tEl Empleado no forma parte de la empresa." +
                    "\n\t- Empleado Activo: " + empleadoRequestDTO.getActive());
        }
    }
    @Override
    public void getAllInfoFromEmpleados(List<EmpleadoRequestDTO> listEmpleados) {
        System.out.println("\nLista de Empleados: " + listEmpleados.toString());


    }

    @Override
    public void deleteEmpleado(Integer id, EmpleadoRequestDTO empleadoRequestDTO) {
        if(empleadoRequestDTO.getActive() == true) {
            empleadoRequestDTO.setActive(false);
            System.out.println("\nEliminando datos del Empleado " +
                    "\n\t- ID Empleado: " + id +
                    "\n\t- Empleado Activo: " + empleadoRequestDTO.getActive());
        }
    }

}
