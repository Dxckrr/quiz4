/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.com.java.model;

/**
 *
 * @author informatica
 */
public class Task {
    private String description;
    private String title;
    private String status;

    public Task(String title, String description, String status) {
        this.description = description;
        this.title = title;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public boolean setDescription(String description) {
        this.description = description;
        return true;
    }

    public String getTitle() {
        return title;
    }

    public boolean setTitle(String title) {
        this.title = title;
        return true;
    }

    public String getStatus() {
        return status;
    }

    public boolean setStatus(String status) {
        this.status = status;
        return true;
    }
    
    
    
}

