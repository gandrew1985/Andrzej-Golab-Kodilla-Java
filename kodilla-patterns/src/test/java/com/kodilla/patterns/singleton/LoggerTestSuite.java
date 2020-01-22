package com.kodilla.patterns.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {
    @Before
    public void log() {
        Logger.getInstance().log("ble ble ble");
    }

    @Test
    public void testLastLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //
        assertEquals("ble ble ble", result);
    }
}