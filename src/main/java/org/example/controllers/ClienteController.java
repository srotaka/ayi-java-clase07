package org.example.controllers;


import org.example.dtos.request.ClienteRequestDTO;
import org.example.services.IClienteService;
import org.example.services.impl.ClienteServiceImpl;

import java.util.List;

public class ClienteController {

    private IClienteService clienteService = new ClienteServiceImpl();

    public void insertCliente(ClienteRequestDTO clienteRequestDTO){

        clienteService.insertCliente(clienteRequestDTO);
    }

    public void updateCliente(Integer id, ClienteRequestDTO clienteRequestDTO){

        clienteService.updateCliente(id, clienteRequestDTO);
    }

    public void getAllInfoFromClientes(List<ClienteRequestDTO> listEmpleados){

        clienteService.getAllInfoFromClientes(listEmpleados);
    }

    public void deleteCliente(Integer id, ClienteRequestDTO clienteRequestDTO){

        clienteService.deleteCliente(id, clienteRequestDTO);
    }


}
