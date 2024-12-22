package com.phonepe;

import com.phonepe.resources.TodoResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class TodoApplication extends Application<TodoConfiguration> {
    public static void main(String[] args) throws Exception {
        new TodoApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<TodoConfiguration> bootstrap){

    }

    @Override
    public void run(TodoConfiguration todoConfiguration, Environment environment) throws Exception {
        System.out.println("Server is running");
        environment.jersey().register(new TodoResource());

    }
}