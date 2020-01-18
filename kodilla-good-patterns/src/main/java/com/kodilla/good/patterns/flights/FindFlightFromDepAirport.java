package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FindFlightFromDepAirport implements FlightFinder {
    @Override
    public void findFlight() {
        FlightsData flightsData = new FlightsData();
        flightsData.getFlightList().stream()
                .filter(fl -> fl.getDepartureAirport().equals("Warsaw"))
                .collect(Collectors.toMap(Flight::getFlightNumber, fl -> fl))
                .entrySet().stream()
                .forEach(System.out::println);
    }
}
