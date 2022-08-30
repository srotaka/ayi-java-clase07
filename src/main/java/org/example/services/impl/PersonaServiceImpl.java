package org.example.services.impl;

import org.example.dtos.request.PersonaRequestDTO;
import org.example.dtos.response.PersonaResponseDTO;
import org.example.mappers.PersonaMapper;
import org.example.services.IPersonaService;
import org.example.utilities.DatosRandom;
import org.modelmapper.ModelMapper;

import java.util.List;

public class PersonaServiceImpl implements IPersonaService {

    DatosRandom datosRandom = new DatosRandom();
    private PersonaMapper mapper;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public void insertPersona(PersonaRequestDTO personaRequestDTO) {

        PersonaResponseDTO responseDTO = new PersonaResponseDTO();

        responseDTO.setNombre(personaRequestDTO.getNombre());
        responseDTO.setApellido(personaRequestDTO.getApellido());
        responseDTO.setCiudad(personaRequestDTO.getCiudad());

        System.out.println("\nInsertando datos de Persona:" +
                "\n\t- Nombre: " + responseDTO.getNombre() +
                "\n\t- Apellido: " + responseDTO.getApellido() +
                "\n\t- Ciudad: " + responseDTO.getCiudad());

    }

    @Override
    public void updatePersona(Integer id, PersonaRequestDTO personaRequestDTO) {
        PersonaResponseDTO responseDTO = new PersonaResponseDTO();

        if(personaRequestDTO.getActive() != false) {
           // personaRequestDTO.setNombre(personaRequestDTO.getNombre());
            //personaRequestDTO.setApellido(personaRequestDTO.getApellido());
            personaRequestDTO.setCiudad(datosRandom.ciudadRandom());
            System.out.println("\nModificando datos de Persona:" +
                    "\n\t- Nombre: " + personaRequestDTO.getNombre() +
                    "\n\t- Apellido: " + personaRequestDTO.getApellido() +
                    "\n\t- Ciudad: " + personaRequestDTO.getCiudad()
            );
        } else {
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tLa persona no forma parte de la base de datos." +
                    "\n\t- Persona Activa: " + personaRequestDTO.getActive());
        }
    }

    @Override
    public void getAllInfoFromPersonas(List<PersonaRequestDTO> listPersonas) {
        System.out.println("\nLista de Personas: " + listPersonas.toString());

    }

    @Override
    public void deletePersona(Integer id, PersonaRequestDTO personaRequestDTO) {
        PersonaResponseDTO responseDTO = new PersonaResponseDTO();

        if(personaRequestDTO.getActive() == true) {
            personaRequestDTO.setActive(false);
            System.out.println("\nEliminando datos de la Persona " +
                    "\n\t- ID Persona: " + id +
                    "\n\t- Persona Activa: " + personaRequestDTO.getActive());
        }
    }

    /*
    @Override
    public void insert(PersonaDTO personaDTO ) {


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


    public void updateDTO(PersonaRequestDTO personaRequestDTO) {
        PersonaResponseDTO responseDTO = new PersonaResponseDTO();

        if(personaRequestDTO.getActive() != false) {
            responseDTO.setCiudad(datosRandom.ciudadRandom());
            System.out.println("\nModificando datos de Persona:" +
                    "\n\t- Nombre: " + responseDTO.getNombre() +
                    "\n\t- Apellido: " + responseDTO.getApellido() +
                    "\n\t- Ciudad: " + responseDTO.getCiudad()
            );
        } else {
            System.out.println("\nERROR: No se ha podido procesar el cambio de datos. " +
                    "\n\tLa persona no forma parte de la base de datos." +
                    "\n\t- Persona Activa: " + responseDTO.getActive());
        }
    }
    */
}
