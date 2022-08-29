package org.example.mappers;

import org.example.dtos.PersonaDTO;
import org.example.entities.Persona;

public class PersonaMapper {

    public Persona dtoToEntity(PersonaDTO dto, Persona persona){
        persona.setNombre(dto.getNombre());
        persona.setApellido(dto.getApellido());
        persona.setCiudad(dto.getCiudad());
        return persona;
    }

    public PersonaDTO entityToDto(Persona persona, PersonaDTO dto){
        dto.setNombre(persona.getNombre());
        dto.setApellido(persona.getApellido());
        dto.setCiudad(persona.getCiudad());
        return dto;
    }
}
