package com.restDBConnect.springboot_rest_dbconnect.entity;
import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "identityiq.spt_task_result")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false,name = "name")
    private String name;

    @Column(nullable = false,name= "type")
    private String type;

    // Default constructor
    public Task() {
    }

    // All-args constructor
    public Task(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Getter and setter for person_nbr
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    // Getter and setter for legal_first_nm
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for logon_cd
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}