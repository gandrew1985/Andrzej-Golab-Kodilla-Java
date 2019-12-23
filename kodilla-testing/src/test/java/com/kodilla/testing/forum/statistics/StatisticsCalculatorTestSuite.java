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
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertEquals(0, usersNr);
        assertEquals(100,postsNr);
        assertEquals(200,commentsNr);
        assertEquals(0,avgPostPerUserNr);
        assertEquals(0,avgCommentsPerUserNr);
        assertEquals(2,avgCommentsPerPostNr);
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
        when(statisticsMock.commentsCount()).thenReturn(800);
        when(statisticsMock.postsCount()).thenReturn(200);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertEquals(100, usersNr);
        assertEquals(200,postsNr);
        assertEquals(800,commentsNr);
        assertEquals(2,avgPostPerUserNr);
        assertEquals(8,avgCommentsPerUserNr);
        assertEquals(4,avgCommentsPerPostNr);
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
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertEquals(0, usersNr);
        assertEquals(0,postsNr);
        assertEquals(100,commentsNr);
        assertEquals(0,avgPostPerUserNr);
        assertEquals(0,avgCommentsPerUserNr);
        assertEquals(0,avgCommentsPerPostNr);
    }

    @Test
    public void testCalculateAdvStatisticsWhen1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            userList.add("userName" + i);
        }
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3000);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertEquals(50, usersNr);
        assertEquals(1000,postsNr);
        assertEquals(3000,commentsNr);
        assertEquals(20,avgPostPerUserNr);
        assertEquals(60,avgCommentsPerUserNr);
        assertEquals(3,avgCommentsPerPostNr);
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
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertEquals(0, usersNr);
        assertEquals(600,postsNr);
        assertEquals(0,commentsNr);
        assertEquals(0,avgPostPerUserNr);
        assertEquals(0,avgCommentsPerUserNr);
        assertEquals(0,avgCommentsPerPostNr);
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
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertTrue(result);
        assertEquals(0, usersNr);
        assertEquals(780,postsNr);
        assertEquals(700,commentsNr);
        assertEquals(0,avgPostPerUserNr);
        assertEquals(0,avgCommentsPerUserNr);
        assertEquals(0,avgCommentsPerPostNr);

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
        int usersNr = statisticsCalculator.getUserNumber();
        int postsNr = statisticsCalculator.getPostsNumber();
        int commentsNr = statisticsCalculator.getCommentsNumber();
        int avgPostPerUserNr = statisticsCalculator.getAvgPostPerUser();
        int avgCommentsPerUserNr = statisticsCalculator.getAvgCommentPerUser();
        int avgCommentsPerPostNr = statisticsCalculator.getAvgCommentPerPost();
        //Then
        assertTrue(result);
        assertEquals(0, usersNr);
        assertEquals(500,postsNr);
        assertEquals(700,commentsNr);
        assertEquals(0,avgPostPerUserNr);
        assertEquals(0,avgCommentsPerUserNr);
        assertEquals(1,avgCommentsPerPostNr);

    }
}