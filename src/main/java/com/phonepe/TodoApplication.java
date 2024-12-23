package com.phonepe;

import com.phonepe.dao.TaskDAO;
import com.phonepe.resources.TodoResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.jdbi3.JdbiFactory;
import org.jdbi.v3.core.Jdbi;

public class TodoApplication extends Application<TodoConfiguration> {
    public static void main(String[] args) throws Exception {
        new TodoApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<TodoConfiguration> bootstrap){

    }

    @Override
    public void run(TodoConfiguration todoConfiguration, Environment environment) throws Exception {
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, todoConfiguration.getDataSourceFactory(), "mysql");

        //System.out.println("Server is running");
        final TaskDAO taskDAO = jdbi.onDemand(TaskDAO.class);
        environment.jersey().register(new TodoResource(taskDAO));
    }
}