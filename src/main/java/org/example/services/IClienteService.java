package org.example.services;

import org.example.dtos.ClienteDTO;

public interface IClienteService {

    void insertCliente(ClienteDTO clienteDTO);
    void updateCliente(ClienteDTO clienteDTO);
    void getAllInfo(ClienteDTO clienteDTO);
    void deleteCliente(ClienteDTO clienteDTO);
}
