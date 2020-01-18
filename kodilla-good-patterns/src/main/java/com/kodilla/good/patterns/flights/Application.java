package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {
        FindFlightWithStopover findFlightWithStopover = new FindFlightWithStopover();
        findFlightWithStopover.findFlight();

        FindFlightFromDepAirport findFlightFromDepAirport = new FindFlightFromDepAirport();
        findFlightFromDepAirport.findFlight();

        FindFlightToArrivalAirport findFlightToArrivalAirport = new FindFlightToArrivalAirport();
        findFlightToArrivalAirport.findFlight();
    }
}
