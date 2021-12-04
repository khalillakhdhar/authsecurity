package com.sec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sec.entities.Task;
import com.sec.repository.TaskRepository;

@Service
public class TaskService {

@Autowired
TaskRepository taskRepository;
public List<Task> getTasks()
{
return taskRepository.findAll();	
}
public Task addtask(Task t)
{
return taskRepository.save(t);	
}
}
