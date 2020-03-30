package com.kodilla.good.patterns.flights;

public class FindDto {

    private String departureAirport;
    private String arrivalAirport;
    private boolean isFounded;

    public FindDto(final String departureAirport, final String arrivalAirport, final boolean isFounded) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.isFounded = isFounded;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public boolean isFounded() {
        return isFounded;
    }
}
