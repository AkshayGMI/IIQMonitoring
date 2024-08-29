package com.restDBConnect.springboot_rest_dbconnect.service.impl;

import lombok.AllArgsConstructor;
import com.restDBConnect.springboot_rest_dbconnect.entity.Task;
import com.restDBConnect.springboot_rest_dbconnect.repository.TaskRepository;
import com.restDBConnect.springboot_rest_dbconnect.service.TaskService;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

/*    @Override
    public Task createTask(Task user) {
        return taskRepository.save(user);
    }*/

    @Override
    public Task getTaskById(String id) {
        Optional<Task> optionalUser = taskRepository.findById(id);
        return optionalUser.get();
    }
    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

 /*   @Override
    public Task updateTasks(Task task) {
        Task existingUser = taskRepository.findById(task.getID()).get();
        existingUser.setID(task.getID());
        existingUser.setName(task.getName());
        existingUser.setType(task.getType());
        Task updatedUser = taskRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteTask(Long userId) {
        taskRepository.deleteById(userId);
    }*/
}