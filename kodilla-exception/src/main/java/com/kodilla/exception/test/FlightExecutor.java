package com.kodilla.exception.test;

public class FlightExecutor {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Berlin","Cracow");
        Flight flight2 = new Flight("Berlin","Amsterdam");

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
