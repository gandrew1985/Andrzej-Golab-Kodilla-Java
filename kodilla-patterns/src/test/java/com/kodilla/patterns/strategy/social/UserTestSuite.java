package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.network.SnapchatPublisher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mill = new Millenials("Mill Kent");
        User yet = new YGeneration("Yeti Young");
        User zet = new ZGeneration("Zenon Bunny");
        //When
        String millPublisher = mill.sharePost();
        System.out.println("Mill is using: " + millPublisher);
        String yetPublisher = yet.sharePost();
        System.out.println("Yeti is using: " + yetPublisher);
        String zetPublisher = zet.sharePost();
        System.out.println("Zenon is using: " + zetPublisher);
        //Then
        assertEquals("Facebook", millPublisher);
        assertEquals("Twitter", yetPublisher);
        assertEquals("Snapchat", zetPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mill = new Millenials("Mill Kent");
        //When
        String millPublisher = mill.sharePost();
        System.out.println("Mill is using: " + millPublisher);
        mill.setSocialPublisher(new SnapchatPublisher());
        millPublisher = mill.sharePost();
        System.out.println("Now Mill is using: " + millPublisher);
        //Then
        assertEquals("Snapchat", millPublisher);

    }
}