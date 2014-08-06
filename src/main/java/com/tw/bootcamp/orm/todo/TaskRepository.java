package com.tw.bootcamp.orm.todo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

import java.sql.SQLException;

public class TaskRepository {

    private final JdbcConnectionSource jdbcConnectionSource;
    private final Dao<Task, Integer> dao;

    public TaskRepository() throws SQLException {
        jdbcConnectionSource = new JdbcConnectionSource("jdbc:h2:mem:todo");
        dao = DaoManager.createDao(jdbcConnectionSource, Task.class);
    }

    public JdbcConnectionSource getJdbcConnectionSource() {
        return jdbcConnectionSource;
    }

    public void create(Task task) throws SQLException {
        dao.create(task);
    }

    public Dao<Task, Integer> getDao() {
        return dao;
    }
}
