package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FindFlightFrom implements FinderFrom {
    @Override
    public boolean find(String departureAirport) {

        FlightsData flightsData = new FlightsData();

        flightsData.getFlightList().stream()
                .filter(fl -> fl.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toMap(Flight::getFlightNumber, fl -> fl))
                .entrySet().stream()
                .forEach(System.out::println);
        return true;
    }
}
