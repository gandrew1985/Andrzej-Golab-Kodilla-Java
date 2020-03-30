package com.kodilla.testing.weather.stub;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherForecastTest {
    @Test
    public void calculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        assertEquals(5,quantityOfSensors);
    }

}