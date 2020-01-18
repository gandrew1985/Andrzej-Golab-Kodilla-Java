package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class FlightsData {

    private final ArrayList<Flight> flightsList = new ArrayList<>();

    public FlightsData() {
        flightsList.add(new Flight("Krakow", "",
                "Wroclaw", 324));
        flightsList.add(new Flight("Warsaw", "Luton",
                "Washington", 276));
        flightsList.add(new Flight("Berlin", "Luton",
                "New York", 326));
        flightsList.add(new Flight("Krakow", "",
                "Szczecin", 435));
    }

    public List<Flight> getFlightList() {
        return new ArrayList<>(flightsList);
    }
}