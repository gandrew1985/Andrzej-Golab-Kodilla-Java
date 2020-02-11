package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_TO_DO = "to do";
    private static final String DESCRIPTION = "You will have to do it asap";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_TO_DO, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readLists = taskListDao.findByListName(listName);
        //Then
        assertEquals(1, readLists.size());
        //CleanUp
        int id = readLists.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: do something", 14);
        Task task2 = new Task("Write some entities", 3);
        TaskFinancialDetails tdf = new TaskFinancialDetails(new BigDecimal(20),false);
        TaskFinancialDetails tdf2 = new TaskFinancialDetails(new BigDecimal(10),false);
        task.setTaskFinancialDetails(tdf);
        task2.setTaskFinancialDetails(tdf2);
        TaskList taskList = new TaskList(LIST_TO_DO,"ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);
        //When
        taskListDao.save(taskList);
        int id = taskList.getId();
        //Then
        assertNotEquals(0,id);
        //CleanUp
        //taskListDao.deleteById(id);
    }
}