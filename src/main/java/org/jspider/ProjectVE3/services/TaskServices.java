package org.jspider.ProjectVE3.services;

import org.jspider.ProjectVE3.model.Task;
import org.jspider.ProjectVE3.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskServices {
    List<Task> taskList = new ArrayList<>();
    @Autowired
    private TaskRepository taskRepository;

    //get all customers
    public List<Task>getAllTasks() {
        List<Task> taskList = taskRepository.findAll();
        return taskList;
    }

    //get customer by id
    public Task getTaskById(int id){
        return taskRepository.findById(id).orElse(null);

    }

    //add task
    public void addTask(Task task) {
        taskRepository.save(task);
    }

    //delete task by id
    public void deleteById(int id) {taskRepository.deleteById(id);
    }

//update tasks
    public void updateTask(int id, Task task) {
        for (int a = 0; a < taskList.size(); a++){
        Task t=taskList.get(id);
        if (t.getId()==id){
            taskList.set(a,task);
        }
    }
    }


}
