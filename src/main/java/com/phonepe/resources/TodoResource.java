package com.phonepe.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/task")
public class TodoResource {

    @GET
    public String gettask(){
        return "TASKS";
    }

    @GET
    @Path("/{id}")
    public String getbyid(@PathParam("id") int id){
        return "Task: "+id;
    }
}
