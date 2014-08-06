package com.tw.bootcamp.orm.todo;

import com.j256.ormlite.field.DatabaseField;

import java.util.Date;
import java.util.List;


public class Task {
    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField
    private String description;
    @DatabaseField
    private String status;
    @DatabaseField
    private Integer priority;

    public Task(String description, String status, Integer priority) {
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Task() {
    }
}
