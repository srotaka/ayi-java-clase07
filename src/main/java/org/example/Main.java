package org.example;

import org.example.controllers.ClienteController;
import org.example.controllers.EmpleadoController;
import org.example.controllers.PersonaController;
import org.example.dtos.ClienteDTO;
import org.example.dtos.EmpleadoDTO;
import org.example.dtos.PersonaDTO;

public class Main {
    public static void main(String[] args) {

        PersonaController personaController = new PersonaController();
        EmpleadoController empleadoController = new EmpleadoController();
        ClienteController clienteController = new ClienteController();

        PersonaDTO persona1 = new PersonaDTO();
        EmpleadoDTO empleado1 = new EmpleadoDTO();
        ClienteDTO clienteDTO = new ClienteDTO();

        System.out.printf("\nDATOS PERSONAS\n");
        personaController.insertPersona(persona1);
        personaController.updatePersona(persona1);
        personaController.getAllInfo(persona1);
        personaController.deletePersona(persona1);
        personaController.updatePersona(persona1);

        System.out.println("\n...................................");

        System.out.printf("\nDATOS EMPLEADOS\n");
        empleadoController.insertEmpleado(empleado1);
        empleadoController.updateEmpleado(empleado1);
        empleadoController.getAllInfo(empleado1);
        empleadoController.deleteEmpleado(empleado1);
        empleadoController.updateEmpleado(empleado1);

        System.out.println("\n...................................");

        System.out.printf("\nDATOS CLIENTE\n");
        clienteController.insertCliente(clienteDTO);
        clienteController.updateCliente(clienteDTO);
        clienteController.getAllInfo(clienteDTO);
        clienteController.deleteCliente(clienteDTO);
        clienteController.updateCliente(clienteDTO);
    }

}