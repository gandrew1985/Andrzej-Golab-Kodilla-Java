package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class FindFlightThrough implements FinderThrough {
    @Override
    public boolean findTrough(String departureAirport, String arrivalAirport) {

        FlightsData flightsData = new FlightsData();

        flightsData.getFlightList().stream()
                .filter(fl -> fl.getDepartureAirport().equals(departureAirport) &&
                        fl.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toMap(Flight::getFlightNumber, fl -> fl))
                .entrySet().stream()
                .forEach(System.out::println);
        return true;
    }
}
