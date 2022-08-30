package org.example.services;

import org.example.dtos.request.PersonaRequestDTO;

import java.util.List;

public interface IPersonaService{
    void insertPersona(PersonaRequestDTO personaRequestDTO);
    void updatePersona(Integer id, PersonaRequestDTO personaRequestDTO);
    void getAllInfoFromPersonas(List<PersonaRequestDTO> listPersonas);
    void deletePersona(Integer id, PersonaRequestDTO personaRequestDTO);

}
