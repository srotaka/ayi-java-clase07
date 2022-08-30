package org.example.controllers;

import org.example.dtos.request.PersonaRequestDTO;
import org.example.services.IPersonaService;
import org.example.services.impl.PersonaServiceImpl;

import java.util.List;

public class PersonaController {

    private IPersonaService iPersonaService = new PersonaServiceImpl();

    public void insertPersona(PersonaRequestDTO personaRequestDTO){

        iPersonaService.insertPersona(personaRequestDTO);
    }

    public void updatePersona(Integer id, PersonaRequestDTO personaRequestDTO){

        iPersonaService.updatePersona(id, personaRequestDTO);
    }

    public void getAllInfoFromPersonas(List<PersonaRequestDTO> listPersonas){

        iPersonaService.getAllInfoFromPersonas(listPersonas);
    }

    public void deletePersona(Integer id, PersonaRequestDTO personaRequestDTO){

        iPersonaService.deletePersona(id, personaRequestDTO);
    }
}
