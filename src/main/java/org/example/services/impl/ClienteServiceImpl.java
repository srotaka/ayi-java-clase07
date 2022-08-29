package org.example.services.impl;

import org.example.dtos.ClienteDTO;
import org.example.services.IClienteService;
import org.example.utilities.DatosRandom;


public class ClienteServiceImpl implements IClienteService {

    DatosRandom datosRandom = new DatosRandom();

    @Override
    public void insertCliente(ClienteDTO clienteDTO) {
        clienteDTO.setId(datosRandom.idRandom());
        clienteDTO.setNombre(datosRandom.nombreRandom());
        clienteDTO.setApellido(datosRandom.apellidoRandom());
        clienteDTO.setEmail(clienteDTO.getNombre().toLowerCase() +"." + clienteDTO.getApellido().toLowerCase()+ "@mail.com");
        clienteDTO.setDireccion(datosRandom.direccionRandom());
        clienteDTO.setCiudad(datosRandom.ciudadRandom());

        System.out.println("\nInsertando datos del Cliente: " +
                "\n\t- Nombre: " + clienteDTO.getNombre() +
                "\n\t- Apellido: " + clienteDTO.getApellido() +
                "\n\t- Email: " + clienteDTO.getEmail()+
                "\n\t- Dirección: " + clienteDTO.getDireccion() +
                "\n\t- Ciudad: " + clienteDTO.getCiudad());
    }

    @Override
    public void updateCliente(ClienteDTO clienteDTO) {

        if(clienteDTO.getActive() != false) {
            clienteDTO.setDireccion(datosRandom.direccionRandom());
            clienteDTO.setCiudad(datosRandom.ciudadRandom());

            System.out.println("\nModificando datos del Cliente: " +
                    "\n\t- Nombre: " + clienteDTO.getNombre() +
                    "\n\t- Apellido: " + clienteDTO.getApellido() +
                    "\n\t- Dirección: " + clienteDTO.getDireccion() +
                    "\n\t- Ciudad: " + clienteDTO.getCiudad());
        } else{
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tEl cliente no forma parte de nuestra base de datos." +
                    "\n\t- Cliente Activo: " + clienteDTO.getActive());
        }
    }

    @Override
    public void getAllInfo(ClienteDTO clienteDTO) {
        System.out.println("\nObteniendo datos del Cliente: " +
                "\n\t- ID: " + clienteDTO.getId() +
                "\n\t- Nombre: " + clienteDTO.getNombre() +
                "\n\t- Apellido: " + clienteDTO.getApellido() +
                "\n\t- Email: " + clienteDTO.getEmail()+
                "\n\t- Dirección: " + clienteDTO.getDireccion() +
                "\n\t- Ciudad: " + clienteDTO.getCiudad() +
                "\n\t- Cliente Activo: " + clienteDTO.getActive());
    }

    @Override
    public void deleteCliente(ClienteDTO clienteDTO) {
        if(clienteDTO.getActive() == true) {
            clienteDTO.setActive(false);
            System.out.println("\nEliminando datos del Cliente Nº " + clienteDTO.getId() +
                    "\n\t- Cliente Activo: " + clienteDTO.getActive());
        }

    }
}
