package org.jspider.ProjectVE3.controller;


//this project developed as per the Assignment using RestApi
//MySql database is used
// use postman to see the output

import org.jspider.ProjectVE3.model.Task;
import org.jspider.ProjectVE3.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TaskController {
    @Autowired
    private TaskServices services;
//geting all task
    @GetMapping("/get/tasks")
    public List<Task> getAllTasks() {
        return services.getAllTasks();
    }

//get task by id
    @GetMapping("/get/tasks/{id}")
    public Task getTaskById(@PathVariable(value = "id") int id) {
        return services.getTaskById(id);
    }


    //add task
    @PostMapping("/add/tasks")
    public void addTask(@RequestBody Task task) {
        services.addTask(task);
    }

//update the tasks by id
    @PutMapping("/update/tasks/{id}")
    public Task updateTask(@PathVariable(value = "id") int id, @RequestBody Task task) {
        services.updateTask(id,task);

        return task;
    }


    //delete task by id
    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable(value = "id") int id) {
        services.deleteById(id);
    }


}



