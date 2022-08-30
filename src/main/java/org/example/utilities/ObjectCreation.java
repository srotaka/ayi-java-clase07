package org.example.utilities;

import org.example.dtos.request.ClienteRequestDTO;
import org.example.dtos.request.EmpleadoRequestDTO;
import org.example.dtos.request.PersonaRequestDTO;
import org.example.utilities.DatosRandom;

import java.util.List;

public class ObjectCreation {
    DatosRandom datosRandom = new DatosRandom();

    public PersonaRequestDTO createPersonaRequest(PersonaRequestDTO personaRequest1){

        personaRequest1.setId(datosRandom.idRandom());
        personaRequest1.setNombre(datosRandom.nombreRandom());
        personaRequest1.setApellido(datosRandom.apellidoRandom());
        personaRequest1.setCiudad(datosRandom.ciudadRandom());
       return personaRequest1;
    }
    public List<PersonaRequestDTO> createListPersonaRequest(List<PersonaRequestDTO> listPersonas){
        PersonaRequestDTO personaRequestDTO1 = new PersonaRequestDTO();
        PersonaRequestDTO personaRequestDTO2 = new PersonaRequestDTO();

        personaRequestDTO1 = createPersonaRequest(personaRequestDTO1);
        personaRequestDTO2 = createPersonaRequest(personaRequestDTO2);

        listPersonas.add(personaRequestDTO1);
        listPersonas.add(personaRequestDTO2);

        return listPersonas;
    }

    public EmpleadoRequestDTO createEmpleadoRequest(EmpleadoRequestDTO empleadoRequest1){

        empleadoRequest1.setIdEmpleado(datosRandom.idRandom());
        empleadoRequest1.setNombre(datosRandom.nombreRandom());
        empleadoRequest1.setApellido(datosRandom.apellidoRandom());
        empleadoRequest1.setCiudad(datosRandom.ciudadRandom());
        empleadoRequest1.setDepartamento(datosRandom.sectorRandom());
        empleadoRequest1.setSueldo(datosRandom.sueldoRandom());
        return empleadoRequest1;
    }

    public List<EmpleadoRequestDTO> createListEmpleadoRequest(List<EmpleadoRequestDTO> listEmpleados){
        EmpleadoRequestDTO empleadoRequest1 = new EmpleadoRequestDTO();
        EmpleadoRequestDTO empleadoRequest2 = new EmpleadoRequestDTO();

        empleadoRequest1 = createEmpleadoRequest(empleadoRequest1);
        empleadoRequest2 = createEmpleadoRequest(empleadoRequest2);

        listEmpleados.add(empleadoRequest1);
        listEmpleados.add(empleadoRequest2);

        return listEmpleados;
    }

    public ClienteRequestDTO createClienteRequest(ClienteRequestDTO clienteRequest1){

        clienteRequest1.setIdCliente(datosRandom.idRandom());
        clienteRequest1.setNombre(datosRandom.nombreRandom());
        clienteRequest1.setApellido(datosRandom.apellidoRandom());
        clienteRequest1.setEmail(clienteRequest1.getNombre().toLowerCase() +"." + clienteRequest1.getApellido().toLowerCase()+ "@mail.com");
        clienteRequest1.setDireccion(datosRandom.direccionRandom());
        clienteRequest1.setCiudad(datosRandom.ciudadRandom());
        return clienteRequest1;
    }

    public List<ClienteRequestDTO> createListClienteRequest(List<ClienteRequestDTO> listCliente){
        ClienteRequestDTO clienteRequest1 = new ClienteRequestDTO();
        ClienteRequestDTO clienteRequest2 = new ClienteRequestDTO();

        clienteRequest1 = createClienteRequest(clienteRequest1);
        clienteRequest2 = createClienteRequest(clienteRequest2);

        listCliente.add(clienteRequest1);
        listCliente.add(clienteRequest2);

        return listCliente;
    }
}
