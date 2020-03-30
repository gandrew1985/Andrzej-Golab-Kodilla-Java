package com.kodilla.good.patterns.flights;

public class FindFromRequest {

    private String departureAirport;

    public FindFromRequest(final String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
}
