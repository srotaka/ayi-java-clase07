package org.example;

import org.example.controllers.ClienteController;
import org.example.controllers.EmpleadoController;
import org.example.controllers.PersonaController;
import org.example.dtos.request.ClienteRequestDTO;
import org.example.dtos.request.EmpleadoRequestDTO;
import org.example.dtos.request.PersonaRequestDTO;
import org.example.utilities.ObjectCreation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonaController personaController = new PersonaController();
        EmpleadoController empleadoController = new EmpleadoController();
        ClienteController clienteController = new ClienteController();
        ObjectCreation objectCreation = new ObjectCreation();

        /* --- CREACIÓN DE PERSONAS --- */
        PersonaRequestDTO personaRequest1 = new PersonaRequestDTO();
        personaRequest1 = objectCreation.createPersonaRequest(personaRequest1);
        List<PersonaRequestDTO> listPersonas = new ArrayList<>();
        listPersonas.add(personaRequest1);
        listPersonas = objectCreation.createListPersonaRequest(listPersonas);

        /* --- CREACIÓN DE EMPLEADOS --- */
        EmpleadoRequestDTO empleadoRequest1 = new EmpleadoRequestDTO();
        empleadoRequest1 = objectCreation.createEmpleadoRequest(empleadoRequest1);
        List<EmpleadoRequestDTO> listEmpleados = new ArrayList<>();
        listEmpleados.add(empleadoRequest1);
        listEmpleados = objectCreation.createListEmpleadoRequest(listEmpleados);

        /* --- CREACIÓN DE CLIENTES --- */
        ClienteRequestDTO clienteRequest1 = new ClienteRequestDTO();
        clienteRequest1 = objectCreation.createClienteRequest(clienteRequest1);
        List<ClienteRequestDTO> listClientes = new ArrayList<>();
        listClientes.add(clienteRequest1);
        listClientes = objectCreation.createListClienteRequest(listClientes);

        /* --- IMPRESIÓN DE RESULTADOS DE PERSONAS --- */
        System.out.println("\n...................................");
        System.out.printf("\nDATOS PERSONAS\n");
        personaController.insertPersona(personaRequest1);
        personaController.updatePersona(personaRequest1.getId(), personaRequest1);
        personaController.getAllInfoFromPersonas(listPersonas);
        personaController.deletePersona(personaRequest1.getId(), personaRequest1);

        /* --- IMPRESIÓN DE RESULTADOS DE EMPLEADOS --- */
        System.out.println("\n...................................");
        System.out.printf("\nDATOS EMPLEADOS\n");
        empleadoController.insertEmpleado(empleadoRequest1);
        empleadoController.updateEmpleado(empleadoRequest1.getIdEmpleado(), empleadoRequest1);
        empleadoController.getAllInfoFromEmpleados(listEmpleados);
        empleadoController.deleteEmpleado(empleadoRequest1.getIdEmpleado(), empleadoRequest1);

        /* --- IMPRESIÓN DE RESULTADOS DE CLIENTES --- */
        System.out.println("\n...................................");
        System.out.printf("\nDATOS CLIENTE\n");
        clienteController.insertCliente(clienteRequest1);
        clienteController.updateCliente(clienteRequest1.getIdCliente(), clienteRequest1);
        clienteController.getAllInfoFromClientes(listClientes);
        clienteController.deleteCliente(clienteRequest1.getIdCliente(), clienteRequest1);


    }

}