/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.controller;
import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;
import todo.com.java.controller.TaskController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *s
 * @author informatica
 */
class TaskControllerTest {
   
    private TaskController taskController;
    @BeforeEach
    
    
    void setUp(){
    
    taskController = new TaskController();
    }
    
    @Test
    void crearTareaTest(){
        Assertions.assertsEquals(true,TaskController.crearTarea("Hola", "soy una tarea"));
    }
    @Test
    void removeTask(){
        Assertions.assertsEquals(false,TaskController.removeTask(50));
    }
    @Test
    void updateTask(){
        Assertions.assertsEquals(false,TaskController.updateTask("HolaOtraVez",1, 1));

        
    }
    
    
    
   
    
    
    
}
