package org.example.controllers;

import org.example.dtos.ClienteDTO;
import org.example.services.IPersonaService;
import org.example.services.impl.ClienteServiceImpl;
import org.example.services.impl.PersonaServiceImpl;

public class ClienteController {

    private IPersonaService clienteService = new ClienteServiceImpl();

    public void insertCliente(ClienteDTO clienteDTO){

        clienteService.insert(clienteDTO);
    }

    public void updateCliente(ClienteDTO clienteDTO){

        clienteService.update(clienteDTO);
    }

    public void getAllInfo(ClienteDTO clienteDTO){

        clienteService.getAllInfo(clienteDTO);
    }

    public void deleteCliente(ClienteDTO clienteDTO){
        clienteService.delete(clienteDTO);
    }
}
