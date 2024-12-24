package com.phonepe.dao;

import com.phonepe.mappers.TaskMapper;
import com.phonepe.models.Task;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

@RegisterRowMapper(TaskMapper.class)
public interface TaskDAO {

    @SqlQuery("SELECT * FROM Tasks WHERE id = :id")
    Optional<Task> getTaskById(@Bind("id") int id);

    @SqlQuery("SELECT * FROM Tasks")
    List<Task> getAllTasks();

    @SqlUpdate("INSERT INTO Tasks (id, task_description, start_date, target_date) VALUES (:id, :task_description, :start_date, :target_date)")
    void createTask(@BindBean Task task);

    @SqlUpdate("UPDATE Tasks SET task_description = :task_description, task_status = :task_status, start_date = :start_date, target_date = :target_date WHERE id = :id")
    void updateTask(@BindBean Task task);
}
