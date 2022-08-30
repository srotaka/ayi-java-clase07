package org.example.services;

import org.example.dtos.request.ClienteRequestDTO;
import org.example.dtos.request.EmpleadoRequestDTO;

import java.util.List;

public interface IClienteService {
    void insertCliente(ClienteRequestDTO clienteRequestDTO);
    void updateCliente(Integer id, ClienteRequestDTO clienteRequestDTO);
    void getAllInfoFromClientes(List<ClienteRequestDTO> listClientes);
    void deleteCliente(Integer id, ClienteRequestDTO clienteRequestDTO);
}
