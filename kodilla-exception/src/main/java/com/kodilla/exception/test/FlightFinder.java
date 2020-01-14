package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();

        flights.put("Cracow", true);
        flights.put("Luton", true);
        flights.put("Heathrow", true);

        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                System.out.println("You can fly to this destination");
            } else {
                throw new RouteNotFoundException("Airport not found, try another location");
            }
        }
    }
}
