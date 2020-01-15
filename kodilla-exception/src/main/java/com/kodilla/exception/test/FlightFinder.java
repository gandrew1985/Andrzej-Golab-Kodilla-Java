package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();

        flights.put("Cracow", false);
        flights.put("Luton", false);
        flights.put("Heathrow", true);

        if ((flights.containsKey(flight.getArrivalAirport()))
                && (flights.get(flight.getArrivalAirport()))) {
            System.out.println("You can fly to this destination");
        } else {
            throw new RouteNotFoundException("You cant flight to this destination, try another location");
        }
    }
}