package org.example.services.impl;

import org.example.dtos.EmpleadoDTO;
import org.example.dtos.PersonaDTO;
import org.example.services.IPersonaService;
import org.example.utilities.DatosRandom;

public class EmpleadoServiceImpl implements IPersonaService {

    DatosRandom datosRandom = new DatosRandom();

    @Override
    public void insert(EmpleadoDTO empleadoDTO) {

            empleadoDTO.setId(datosRandom.idRandom());
            empleadoDTO.setNombre(datosRandom.nombreRandom());
            empleadoDTO.setApellido(datosRandom.apellidoRandom());
            empleadoDTO.setCiudad(datosRandom.ciudadRandom());
            empleadoDTO.setDepartamento(datosRandom.sectorRandom());
            empleadoDTO.setSueldo(datosRandom.sueldoRandom());

            System.out.println("\nInsertando datos del Empleado: " +
                    "\n\t- Nombre: " + empleadoDTO.getNombre() +
                    "\n\t- Apellido: " + empleadoDTO.getApellido() +
                    "\n\t- Sueldo: US$ " + empleadoDTO.getSueldo() +
                    "\n\t- Departamento: " + empleadoDTO.getDepartamento());
    }

    @Override
    public void update(EmpleadoDTO empleadoDTO) {

        if(empleadoDTO.getActive() != false) {
            empleadoDTO.setSueldo(datosRandom.sueldoRandom());
            empleadoDTO.setDepartamento(datosRandom.sectorRandom());

            System.out.println("\nModificando datos del Empleado: " +
                    "\n\t- Nombre: " + empleadoDTO.getNombre() +
                    "\n\t- Apellido: " + empleadoDTO.getApellido() +
                    "\n\t- Sueldo: US$ " + empleadoDTO.getSueldo() +
                    "\n\t- Departamento: " + empleadoDTO.getDepartamento());
        } else{
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tEl empleado no forma parte de la compañía." +
                    "\n\t- Empleado Activo: " + empleadoDTO.getActive());
        }
    }

    @Override
    public void getAllInfo(EmpleadoDTO empleadoDTO) {
        System.out.println("\nObteniendo datos del Empleado: " +
                "\n\t- ID: " + empleadoDTO.getId() +
                "\n\t- Nombre: " + empleadoDTO.getNombre() +
                "\n\t- Apellido: " + empleadoDTO.getApellido() +
                "\n\t- Ciudad: " + empleadoDTO.getCiudad()+
                "\n\t- Sueldo: US$ " + empleadoDTO.getSueldo() +
                "\n\t- Departamento: " + empleadoDTO.getDepartamento() +
                "\n\t- Empleado Activo: " + empleadoDTO.getActive());
    }


    @Override
    public void delete(EmpleadoDTO empleadoDTO) {

        if(empleadoDTO.getActive() == true) {
            empleadoDTO.setActive(false);
            System.out.println("\nEliminando datos del Empleado Nº " + empleadoDTO.getId() +
                    "\n\t- Empleado Activo: " + empleadoDTO.getActive());
        }
    }
}
