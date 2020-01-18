package com.kodilla.good.patterns.flights;

public class FindRequestRetriever {

    public FindFromRequest retrieveFrom() {
        String flightFrom = "Gatwick";
        return new FindFromRequest(flightFrom);
    }

    public FindToRequest retrieveTo() {
        String flightTo = "Szczecin";
        return new FindToRequest(flightTo);
    }

    public FindThroughRequest retrieveThrough() {
        String flightFrom = "Berlin";
        String flightTo = "New York";
        return new FindThroughRequest(flightFrom, flightTo);
    }
}
