package org.example.services;

import org.example.dtos.PersonaDTO;

public interface IPersonaService {
    void insert(PersonaDTO personaDTO);
    void update(PersonaDTO personaDTO);
    void getAllInfo(PersonaDTO personaDTO);
    void delete(PersonaDTO personaDTO);

}
