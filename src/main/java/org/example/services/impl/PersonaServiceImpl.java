package org.example.services.impl;

import org.example.dtos.PersonaDTO;
import org.example.mappers.PersonaMapper;
import org.example.services.IPersonaService;
import org.example.utilities.DatosRandom;
import org.modelmapper.ModelMapper;

public class PersonaServiceImpl implements IPersonaService<PersonaDTO> {

    DatosRandom datosRandom = new DatosRandom();
    private PersonaMapper mapper;

    @Override
    public void insert(PersonaDTO personaDTO ) {
        //ModelMapper modelMapper = new ModelMapper();

        personaDTO.setNombre(datosRandom.nombreRandom());
        personaDTO.setApellido(datosRandom.apellidoRandom());
        personaDTO.setCiudad(datosRandom.ciudadRandom());

        //Persona persona = modelMapper.map(personaDTO, Persona.class);
        //Persona persona = mapper.dtoToEntity(personaDTO, new Persona());
        //PersonaDTO result = mapper.entityToDto(persona, new PersonaDTO());

        System.out.println("\nInsertando datos de Persona:" +
                        "\n\t- Nombre: " + personaDTO.getNombre() +
                        "\n\t- Apellido: " + personaDTO.getApellido() +
                        "\n\t- Ciudad: " + personaDTO.getCiudad()
        );
    }
    @Override
    public void update(PersonaDTO personaDTO) {
        if(personaDTO.getActive() != false) {
            personaDTO.setCiudad(datosRandom.ciudadRandom());
            System.out.println("\nModificando datos de Persona:" +
                    "\n\t- Nombre: " + personaDTO.getNombre() +
                    "\n\t- Apellido: " + personaDTO.getApellido() +
                    "\n\t- Ciudad: " + personaDTO.getCiudad()
            );
        } else {
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tLa persona no forma parte de la base de datos." +
                    "\n\t- Persona Activa: " + personaDTO.getActive());
        }
    }

    @Override
    public void getAllInfo(PersonaDTO personaDTO) {
        System.out.println("\nObteniendo datos de la Persona: " +
                "\n\t- Nombre: " + personaDTO.getNombre() +
                "\n\t- Apellido: " + personaDTO.getApellido() +
                "\n\t- Ciudad: " + personaDTO.getCiudad() +
                "\n\t- Persona Activa: " + personaDTO.getActive());
    }

    @Override
    public void delete(PersonaDTO personaDTO) {
        if(personaDTO.getActive() == true) {
            personaDTO.setActive(false);
            System.out.println("\nEliminando datos de la Persona " +
                    "\n\t- Persona Activa: " + personaDTO.getActive());
        }

    }
}
