package com.phonepe.models;

import java.time.LocalDate;

public class Task {
    private int id;
    private String task_description;
    private String task_status;
    private LocalDate start_date;
    private LocalDate target_date;

    public void setId(int id) {
        this.id = id;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public void setTarget_date(LocalDate target_date) {
        this.target_date = target_date;
    }

    public int getId() {
        return id;
    }

    public String getTask_description() {
        return task_description;
    }

    public String getTask_status() {
        return task_status;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public LocalDate getTarget_date() {
        return target_date;
    }

}
