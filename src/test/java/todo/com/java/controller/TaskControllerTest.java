/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.controller;

import todo.com.java.model.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 *s
 * @author informatica
 */
class TaskControllerTest {
    static  ArrayList<Task> tareas =new ArrayList<Task>();
    TaskController taskController;

    @BeforeEach
    
    
    void setUp(){
    
    taskController = new TaskController();
  // tareas =new ArrayList<Task>();

    taskController.crearTarea("Chanchito feliz","esta triste");
    }
    
    @Test
    void crearTareaTest(){
        Assertions.assertEquals(true,taskController.crearTarea("Hola", "soy una tarea"));
    }
    @Test
    void removeTask(){
        Assertions.assertEquals(true,taskController.removeTask(0));
    }
    @Test
    void updateTask(){
        Assertions.assertEquals(true,TaskController.updateTask("Continue",3,0));

        
    }

}
