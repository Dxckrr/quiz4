/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.model;

import todo.com.java.model.Task;
import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author informatica
 */
class TaskTest {

    private Task task;

    @BeforeEach

    void setUp() {
        task = new Task("HolaUsuario", "soy una tarea feliz", "e.g");
    }

    @Test
    void setDescriptionTest() {
        Assertions.assertsEquals(true, task.setDescription("soy una tarea feliz"));
    }

    @Test
    void getDescriptionTest() {
        Assertions.assertsEquals(true, task.getDescription());
    }

    @Test
    void setTitleTest() {
        Assertions.assertsEquals(true, task.setTitle("HolaOtraVez"));
    }

    void getTitleTest() {
        Assertions.assertsEquals(true, task.getTitle());
    }

    void setStatus() {
        Assertions.assertsEquals(true, task.setStatus("complete"));

    }

    void getStatus() {
        Assertions.assertsEquals(true, task.getStatus());

    }

}
