package com.restDBConnect.springboot_rest_dbconnect.service;
import com.restDBConnect.springboot_rest_dbconnect.entity.Task;
import java.util.List;

    public interface TaskService {
    /*   Task createTask(Task user);*/

        Task getTaskById(String id);

        List<Task> getAllTasks();

    /*   Task updateTasks(Task user);

        void deleteTask(Long userId);*/
    }

