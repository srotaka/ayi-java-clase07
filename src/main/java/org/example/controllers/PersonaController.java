package org.example.controllers;

import org.example.dtos.PersonaDTO;
import org.example.entities.Persona;
import org.example.services.IPersonaService;
import org.example.services.impl.PersonaServiceImpl;
import org.example.utilities.DatosRandom;

public class PersonaController {

    private IPersonaService iPersonaService = new PersonaServiceImpl();

    public void insertPersona(PersonaDTO personaDTO){
        iPersonaService.insert(personaDTO);
    }

    public void updatePersona(PersonaDTO personaDTO){
        iPersonaService.update(personaDTO);
    }

    public void getAllInfo(PersonaDTO personaDTO){
        iPersonaService.getAllInfo(personaDTO);
    }

    public void deletePersona(PersonaDTO personaDTO){
        iPersonaService.delete(personaDTO);
    }
}
