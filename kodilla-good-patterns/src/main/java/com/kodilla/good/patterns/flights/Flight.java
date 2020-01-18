package com.kodilla.good.patterns.flights;

public class Flight {

    private String departureAirport;
    private String stopoverAirport;
    private String arrivalAirport;
    private int flightNumber;

    public Flight(String departureAirport, String stopoverAirport, String arrivalAirport, int flightNumber) {
        this.departureAirport = departureAirport;
        this.stopoverAirport = stopoverAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getStopoverAirport() {
        return stopoverAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight that = (Flight) o;

        if (flightNumber != that.flightNumber) return false;
        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (stopoverAirport != null ? !stopoverAirport.equals(that.stopoverAirport) : that.stopoverAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "departureAirport:'" + departureAirport + '\'' +
                ", stopoverAirport:'" + stopoverAirport + '\'' +
                ", arrivalAirport:'" + arrivalAirport + '\'' +
                '}';
    }
}
