package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepo;

@Service
public class TaskService {

    private final TaskRepo taskRepository;

    public TaskService(TaskRepo taskRepository) {
        this.taskRepository = taskRepository;
    }

    
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

   
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}
