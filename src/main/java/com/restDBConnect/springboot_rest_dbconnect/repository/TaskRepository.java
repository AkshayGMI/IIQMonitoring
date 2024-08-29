package com.restDBConnect.springboot_rest_dbconnect.repository;
import com.restDBConnect.springboot_rest_dbconnect.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface TaskRepository extends JpaRepository<Task, String> {
    }
