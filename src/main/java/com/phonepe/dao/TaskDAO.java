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
}
