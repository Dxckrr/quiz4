/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.controller;

import java.util.ArrayList;
import todo.com.java.model.Task;

public class TaskController {
    
    static ArrayList<Task> tareas = new ArrayList<Task>();
    public TaskController(){
        
    }
    
    public static boolean crearTarea(String title, String descripcion){
        
        Task task = new Task(title,descripcion, "e.g");
        tareas.add(task);
        return true;
    }
    
    public static ArrayList<Task> getTareas(){
        return tareas;
    }
    
    public static boolean removeTask(int tarea){
        tareas.remove(tarea);
        return true;
    }
    
    public static boolean updateTask(String nuevoAtributo, int opcionActualizar, int tarea){
        switch(opcionActualizar){
             case 1:
                 tareas.get(tarea).setTitle(nuevoAtributo);
                 break;                
             case 2:
                 tareas.get(tarea).setDescription(nuevoAtributo);
                 break;
             case 3:
                 tareas.get(tarea).setStatus(nuevoAtributo);
                 break;
        }        
        return true;
    }
    
}
