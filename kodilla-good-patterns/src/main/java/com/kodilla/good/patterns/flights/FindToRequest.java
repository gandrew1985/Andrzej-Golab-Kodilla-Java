package com.kodilla.good.patterns.flights;

public class FindToRequest {

    private String arrivalAirport;

    public FindToRequest(final String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
