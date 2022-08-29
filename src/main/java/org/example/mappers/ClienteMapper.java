package org.example.mappers;

import org.example.dtos.ClienteDTO;
import org.example.entities.Cliente;

public class ClienteMapper {

    public Cliente dtoToEntity(ClienteDTO dto, Cliente cliente){

        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setDireccion(dto.getDireccion());
        cliente.setCiudad(dto.getCiudad());
        cliente.setEmail(dto.getEmail());
        return cliente;
    }

    public ClienteDTO entityToDto(Cliente cliente, ClienteDTO dto){

        dto.setNombre(cliente.getNombre());
        dto.setApellido(cliente.getApellido());
        dto.setDireccion(cliente.getDireccion());
        dto.setCiudad(cliente.getCiudad());
        dto.setEmail(cliente.getEmail());
        return dto;
    }
}
