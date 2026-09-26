package com.todobien.task.domain.usecase;

import com.todobien.task.domain.model.Task;
import com.todobien.task.domain.model.gateway.TaskGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TaskUseCase {

    private final TaskGateway taskGateway;



    public Task createTask(Task task)
    {
        //TODO IMPLEMENTAR REGLAS
        return taskGateway.createTask(task);
    }

    public String save(Task task)
    {
        //TODO IMPLEMENTAR REGLAS
        return taskGateway.save(task);

    }

    public Task findById(String id)
    {
        //TODO IMPLEMENTAR REGLAS
        return taskGateway.findById(id);
    }

    public List<Task> findAll()
    {
        //TODO IMPLEMENTAR REGLAS
        return taskGateway.findAll();

    }
    public List<Task> findByTitle(String title)
    {
        //TODO IMPLEMENTAR REGLAS
        return taskGateway.findByTitle(title);

    }
    public void deleteById(String id)
    {
        //TODO IMPLEMENTAR REGLAS
        taskGateway.deleteById(id);
    }
    public Task updateTask(Task task){
        //TODO IMPLEMENTAR REGLAS
        return taskGateway.updateTask(task);
        
    }


}
