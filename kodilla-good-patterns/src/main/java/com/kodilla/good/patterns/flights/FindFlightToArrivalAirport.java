package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FindFlightToArrivalAirport implements FlightFinder {
    @Override
    public void findFlight() {

        FlightsData flightsData = new FlightsData();
        flightsData.getFlightList().stream()
                .filter(fl -> fl.getArrivalAirport().equals("Wroclaw"))
                .collect(Collectors.toMap(Flight::getFlightNumber, fl -> fl))
                .entrySet().stream()
                .forEach(System.out::println);
    }
}
