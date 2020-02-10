package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static String DESCRIPTION = "Test: Learn Hibernate ";

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //When
        taskDao.save(task);
        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        //When
        List<Task> readTasks = taskDao.findByDuration(duration);
        //Then
        assertEquals(1, readTasks.size());
        //CleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
}