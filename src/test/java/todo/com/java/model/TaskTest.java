/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.model;

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
        Assertions.assertEquals(true, task.setDescription("soy una tarea feliz"));
    }

    @Test
    void getDescriptionTest() {
        Assertions.assertEquals("soy una tarea feliz", task.getDescription());
    }

    @Test
    void setTitleTest() {
        Assertions.assertEquals(true, task.setTitle("HolaOtraVez"));
    }

    void getTitleTest() {
        Assertions.assertEquals("HolaOtraVez", task.getTitle());
    }

    void setStatus() {
        Assertions.assertEquals(true, task.setStatus("complete"));

    }

    void getStatus() {
        Assertions.assertEquals("complete", task.getStatus());

    }

}
