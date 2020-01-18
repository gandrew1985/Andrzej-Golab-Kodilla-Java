package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FindFlightWithStopover implements FlightFinder {
    @Override
    public void findFlight() {

        FlightsData flightsData = new FlightsData();
        flightsData.getFlightList().stream()
                .filter(fl -> fl.getStopoverAirport().equals("Luton"))
                .collect(Collectors.toMap(Flight::getFlightNumber, fl -> fl))
                .entrySet().stream()
                .forEach(System.out::println);
    }
}
