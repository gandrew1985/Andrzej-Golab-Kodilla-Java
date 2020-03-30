package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FindFlightTo implements FinderTo {
    @Override
    public boolean findTo(String arrivalAirport) {

        FlightsData flightsData = new FlightsData();

        flightsData.getFlightList().stream()
                .filter(fl -> fl.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toMap(Flight::getFlightNumber, fl -> fl))
                .entrySet().stream()
                .forEach(System.out::println);
        return true;
    }
}
