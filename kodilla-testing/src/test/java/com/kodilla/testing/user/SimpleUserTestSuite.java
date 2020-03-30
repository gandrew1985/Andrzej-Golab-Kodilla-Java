package com.kodilla.testing.user;
import org.junit.*;

public class SimpleUserTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }
    @After
    public void after() {
        System.out.println("Test case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseUserName() {
        //Given
        SimpleUser user = new SimpleUser("mrsmith", "John Smith");
        //When
        String result = user.getUserName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("mrsmith",result);
    }
    @Test
    public void testCaseRealName() {
        //Given
        SimpleUser user = new SimpleUser("mrsmith","John Smith");
        //When
        String result = user.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("John Smith", result);
    }
}
