package org.example.services.impl;

import org.example.dtos.request.ClienteRequestDTO;
import org.example.dtos.response.ClienteResponseDTO;
import org.example.services.IClienteService;
import org.example.utilities.DatosRandom;

import java.util.List;


public class ClienteServiceImpl implements IClienteService {
    DatosRandom datosRandom = new DatosRandom();

    @Override
    public void insertCliente(ClienteRequestDTO clienteRequestDTO) {
        ClienteResponseDTO responseDTO = new ClienteResponseDTO();

        responseDTO.setNombre(clienteRequestDTO.getNombre());
        responseDTO.setApellido(clienteRequestDTO.getApellido());
        responseDTO.setEmail(clienteRequestDTO.getEmail());
        responseDTO.setDireccion(clienteRequestDTO.getDireccion());
        responseDTO.setCiudad(clienteRequestDTO.getCiudad());

        System.out.println("\nInsertando datos del Cliente: " +
                "\n\t- ID Cliente: " + clienteRequestDTO.getIdCliente() +
                "\n\t- Nombre: " + responseDTO.getNombre() +
                "\n\t- Apellido: " + responseDTO.getApellido() +
                "\n\t- Email: " + responseDTO.getEmail()+
                "\n\t- Dirección: " + responseDTO.getDireccion() +
                "\n\t- Ciudad: " + responseDTO.getCiudad());

    }

    @Override
    public void updateCliente(Integer id, ClienteRequestDTO clienteRequestDTO) {
        ClienteResponseDTO responseDTO = new ClienteResponseDTO();
        if(clienteRequestDTO.getActive() != false) {
            clienteRequestDTO.setDireccion(datosRandom.direccionRandom());
            clienteRequestDTO.setCiudad(datosRandom.ciudadRandom());

            System.out.println("\nModificando datos del Cliente: " +
                    "\n\t- ID Cliente: " + clienteRequestDTO.getIdCliente() +
                    "\n\t- Nombre: " + clienteRequestDTO.getNombre() +
                    "\n\t- Apellido: " + clienteRequestDTO.getApellido() +
                    "\n\t- Dirección: " + clienteRequestDTO.getDireccion() +
                    "\n\t- Ciudad: " + clienteRequestDTO.getCiudad());
        } else{
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tEl cliente no forma parte de nuestra base de datos." +
                    "\n\t- Cliente Activo: " + clienteRequestDTO.getActive());
        }
    }
    @Override
    public void getAllInfoFromClientes(List<ClienteRequestDTO> listClientes) {
        System.out.println("\nLista de Clientes: " + listClientes.toString());

    }

    @Override
    public void deleteCliente(Integer id, ClienteRequestDTO clienteRequestDTO) {
        if(clienteRequestDTO.getActive() == true) {
            clienteRequestDTO.setActive(false);
            System.out.println("\nEliminando datos del Cliente Nº " + id +
                    "\n\t- Cliente Activo: " + clienteRequestDTO.getActive());
        }

    }
}
