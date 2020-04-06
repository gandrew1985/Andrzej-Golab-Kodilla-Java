package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {

        //Given
        JavaHelpForumTopic javaHelpForumTopic = new JavaHelpForumTopic();
        JavaToolsForumTopic javaToolsForumTopic = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser adiKowal = new ForumUser("Adi Kowal");
        ForumUser benClark = new ForumUser("Ben Clark");
        javaHelpForumTopic.registerObserver(johnSmith);
        javaHelpForumTopic.registerObserver(adiKowal);
        javaToolsForumTopic.registerObserver(adiKowal);
        javaToolsForumTopic.registerObserver(benClark);
        //When
        javaHelpForumTopic.addPost("Hi everyone, this is first post");
        javaHelpForumTopic.addPost("Hi, this is second post");
        javaToolsForumTopic.addPost("Hello, first post");
        javaToolsForumTopic.addPost("Hello, second post");
        javaHelpForumTopic.addPost("Hi, this is third post");
        //Then
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,benClark.getUpdateCount());
        assertEquals(5,adiKowal.getUpdateCount());
    }
}