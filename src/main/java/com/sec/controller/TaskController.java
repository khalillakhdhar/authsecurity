package com.sec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sec.entities.Task;

@RestController
public class TaskController {
@Autowired
TaskService taskService;
@GetMapping("/tasks")
public List<Task> getListTasks(){
return taskService.getTasks();
}
public Task save(@RequestBody @Valid Task t) {
	return taskService.addtask(t);

}
}
