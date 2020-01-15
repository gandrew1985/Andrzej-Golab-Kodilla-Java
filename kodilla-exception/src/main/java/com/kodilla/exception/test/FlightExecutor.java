package com.kodilla.exception.test;

public class FlightExecutor {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Berlin", "Cracow");
        Flight flight2 = new Flight("Berlin", "Luton");
        Flight flight3 = new Flight("Amsterdam", "Heathrow");

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Flight 1 checked, see the result above!\n");
        }

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Flight 2 checked, see the result above!\n");
        }

        try {
            flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Flight 3 checked, see the result above!");
        }
    }
}
