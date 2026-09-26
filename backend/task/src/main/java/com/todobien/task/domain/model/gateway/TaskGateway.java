package com.todobien.task.domain.model.gateway;

import com.todobien.task.domain.model.Task;

import java.util.List;

public interface TaskGateway {
    public Task createTask(Task task);
    public String save(Task task);
    public Task findById(String id);
    public List<Task> findAll();
    public List<Task> findByTitle(String title);
    public void deleteById(String id);
    public Task updateTask(Task task);

}
