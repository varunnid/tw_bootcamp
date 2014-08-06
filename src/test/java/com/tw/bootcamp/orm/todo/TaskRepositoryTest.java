package com.tw.bootcamp.orm.todo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class TaskRepositoryTest {

    private TaskRepository taskRepository;
    private JdbcConnectionSource jdbcConnectionSource;

    @Before
    public void setUp() throws SQLException {
        taskRepository = new TaskRepository();
        jdbcConnectionSource = taskRepository.getJdbcConnectionSource();
        TableUtils.createTable(jdbcConnectionSource, Task.class);
    }

    @Test
    public void shouldCreateTheTask() throws SQLException {
        Task task = new Task("buy tickets", "INPROGRESS", 1);
        taskRepository.create(task);
        Dao<Task, Integer> taskDataAccess = taskRepository.getDao();
        assertEquals(1, taskDataAccess.countOf());

    }

}