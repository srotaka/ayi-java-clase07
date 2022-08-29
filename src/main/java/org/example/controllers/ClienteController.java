package org.example.controllers;

import org.example.dtos.ClienteDTO;
import org.example.services.IClienteService;
import org.example.services.impl.ClienteServiceImpl;

public class ClienteController {

    private IClienteService iClienteService = new ClienteServiceImpl();

    public void insertCliente(ClienteDTO clienteDTO){
        iClienteService.insertCliente(clienteDTO);
    }

    public void updateCliente(ClienteDTO clienteDTO){
        iClienteService.updateCliente(clienteDTO);
    }

    public void getAllInfo(ClienteDTO clienteDTO){
        iClienteService.getAllInfo(clienteDTO);
    }

    public void deleteCliente(ClienteDTO clienteDTO){
        iClienteService.deleteCliente(clienteDTO);
    }
}
