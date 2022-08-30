package org.example.mappers;

import org.example.dtos.PersonaDTO;
import org.example.dtos.request.PersonaRequestDTO;
import org.example.dtos.response.PersonaResponseDTO;
import org.example.entities.Persona;

public class PersonaMapper {

    public Persona dtoToEntity(PersonaRequestDTO dto, Persona persona){
        persona.setNombre(dto.getNombre());
        persona.setApellido(dto.getApellido());
        persona.setCiudad(dto.getCiudad());
        return persona;
    }

    public PersonaResponseDTO entityToDto(Persona persona, PersonaResponseDTO dto){
        dto.setNombre(persona.getNombre());
        dto.setApellido(persona.getApellido());
        dto.setCiudad(persona.getCiudad());
        return dto;
    }
}
