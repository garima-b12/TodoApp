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
}
