package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Set<Continent> continentsList = new HashSet<>();
        Set<Country> countryList = new HashSet<>();
        //Create Continents
        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent southAmerica = new Continent("South America");
        Continent northAmerica = new Continent("North America");
        //Create Countries
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country austria = new Country("Austria", new BigDecimal("8900000"));
        Country thailand = new Country("Thailand", new BigDecimal("69000000"));
        Country brazil = new Country("Brazil", new BigDecimal("209000000"));
        Country usa = new Country("USA", new BigDecimal("310000000"));
        countryList.add(poland);
        countryList.add(austria);
        countryList.add(thailand);
        countryList.add(brazil);
        countryList.add(usa);
        //When
        BigDecimal totalPeople = countryList.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedPeople = new BigDecimal("636900000");
        assertEquals(expectedPeople, totalPeople);
    }
}