package com.phonepe.mappers;

import com.phonepe.models.Task;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<Task> {
    @Override
    public Task map(ResultSet rs, StatementContext ctx) throws SQLException {
        Task task = new Task();
        task.setId(rs.getInt("id"));
        task.setTask_description(rs.getString("task_description"));
        task.setTask_status(rs.getString("task_status"));
        task.setStart_date(rs.getDate("start_date").toLocalDate());
        task.setTarget_date(rs.getDate("target_date").toLocalDate());
        return task;
    }
}
