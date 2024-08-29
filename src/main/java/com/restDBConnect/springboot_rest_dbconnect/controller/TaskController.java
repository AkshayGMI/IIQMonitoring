package com.restDBConnect.springboot_rest_dbconnect.controller;

import lombok.AllArgsConstructor;
import com.restDBConnect.springboot_rest_dbconnect.entity.Task;
import com.restDBConnect.springboot_rest_dbconnect.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/tasks")
public class TaskController {
@Autowired
    private TaskService taskService;

    // build create User REST API
/*    @PostMapping
    public ResponseEntity<Task> createUser(@RequestBody Task user){
        Task savedUser = taskService.createTask(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }*/

    // build get user by id REST API
    // http://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public ResponseEntity<Task> getUserById(@PathVariable("id") String ID){
        Task searchedTask = taskService.getTaskById(ID);
        return new ResponseEntity<>(searchedTask, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAllUsers(){
        List<Task> users = taskService.getAllTasks();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build Update User REST API
   /* @PutMapping("{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<Task> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody Task user){
        user.setID(userId);
        Task updatedUser = taskService.updateTasks(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        taskService.deleteTask(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }*/
}
