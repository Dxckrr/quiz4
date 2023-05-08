/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.view;

import todo.com.java.model.Task;
import java.util.ArrayList;

import java.util.Scanner;
import todo.com.java.controller.TaskController;

/**
 *
 * @author informatica
 */
public class ConsoleView {

    Scanner scanner = new Scanner(System.in);

    public ConsoleView() {
        askWhatToDo();
    }

    private void mostrarTareas(Task tarea) {

        System.out.println(tarea.getTitle());
        System.out.println(tarea.getDescription());
        System.out.println(tarea.getStatus());
    }

    private void askWhatToDo() {
        int tarea = 0;

        ArrayList<Task> listaTares = TaskController.getTareas();
        int opcion = 0;
        int opcionActualizar = 0;
        String titulo;
        String descripcion;

        System.out.println("Que desea hacer: ");
        System.out.println("1. Crear tarea      2. Leer Tarea.\n3. Actualizar tarea.      4. Borrar Tarea");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Titulo: ");
                titulo = scanner.nextLine();
                System.out.println("Descripcion: ");
                descripcion = scanner.nextLine();
                TaskController.crearTarea(titulo, descripcion);
                break;
            case 2:
                System.out.println("Que tarea desea ver: ");
                mostrarLista(listaTares);
                tarea = scanner.nextInt();
                System.out.println(listaTares.get(tarea).toString());
                break;
            case 3:
                String nuevoAtributo;

                System.out.println("Que tarea desea actualizar: ");
                mostrarLista(listaTares);
                tarea = scanner.nextInt();
                System.out.println("Que desea actaulizar:");
                System.out.println("1. Titulo.      2. Descripción.     3. Estado.");
                opcionActualizar = scanner.nextInt();
                nuevoAtributo = scanner.nextLine();

                TaskController.updateTask(nuevoAtributo, opcionActualizar, tarea);

                break;
            case 4:
                System.out.println("Que tarea desea borrar: ");
                mostrarLista(listaTares);
                tarea = scanner.nextInt();
                TaskController.removeTask(tarea);

                break;

            default:

                break;
        }

    }

    private void mostrarLista(ArrayList<Task> listaTares) {
        for (Task object : listaTares) {
            System.out.println(object.getTitle());
        }
    }

}
