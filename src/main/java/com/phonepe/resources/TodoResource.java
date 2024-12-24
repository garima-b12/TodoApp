package com.phonepe.resources;

import com.phonepe.dao.TaskDAO;
import com.phonepe.models.Task;
import jakarta.ws.rs.*;

import java.util.List;
import java.util.Optional;

@Path("/task")
public class TodoResource {
    private final TaskDAO taskDAO;

    public TodoResource(TaskDAO taskDAO){
        this.taskDAO = taskDAO;
    }

    @GET
    public List<Task> getAllTask(){
        return taskDAO.getAllTasks();
    }

    @GET
    @Path("/{id}")
    public Optional<Task> getTaskById(@PathParam("id") int id){
        return taskDAO.getTaskById(id);
    }

    @POST
    public String createTask(Task task){
        taskDAO.createTask(task);
        return "Task created";
    }

    @PUT
    @Path("/{id}")
    public String updateTask(@PathParam("id")int id, Task task){
        task.setId(id);
        taskDAO.updateTask(task);
        return "Task updated";
    }

    @DELETE
    @Path("{id}")
    public String deleteTask(@PathParam("id") int id) {
        taskDAO.deleteTask(id);
        return "Task deleted";
    }
}
