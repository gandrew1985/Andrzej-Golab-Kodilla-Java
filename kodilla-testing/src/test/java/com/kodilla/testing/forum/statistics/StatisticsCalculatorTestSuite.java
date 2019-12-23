package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.statistics.Statistics;
import com.kodilla.testing.statistics.StatisticsCalculator;
import org.junit.*;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    public static int counter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Test Suits begin!!");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("Test Suit COMPLETED!!");
    }

    @Before
    public void beforeEachTest() {
        counter++;
        System.out.println("Test Case nr # " + counter );
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNr = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userNr);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersNr = statisticsCalculator.getUserNumber();
        //Then
        assertEquals(0, usersNr);
    }

    @Test
    public void testCalculateAdvStatisticsWhen100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            userList.add("userName" + i);
        }
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(350);
        when(statisticsMock.postsCount()).thenReturn(700);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int result = statisticsCalculator.getUserNumber();
        //Then
        assertEquals(100,result);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int result = statisticsCalculator.getPostsNumber();
        //Then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateAdvStatisticsWhen1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            userList.add("userName" + i);
        }
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int result = statisticsCalculator.getAvgPostPerUser();
        //Then
        assertEquals(50, result);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(600);
        when(statisticsMock.commentsCount()).thenReturn(0);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int result = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertEquals(0, result);
    }

    @Test
    public void testCalculateAdvStatisticsMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(780);
        when(statisticsMock.commentsCount()).thenReturn(700);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        boolean result = statisticsCalculator.getPostsNumber() > statisticsCalculator.getCommentsNumber();
        //Then
        assertTrue(result);
    }

    @Test
    public void testCalculateAdvStatisticsMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(700);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        boolean result = statisticsCalculator.getPostsNumber() < statisticsCalculator.getCommentsNumber();
        //Then
        assertTrue(result);
    }
}