package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
}