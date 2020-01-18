package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {
        FindRequestRetriever findRequestRetriever = new FindRequestRetriever();
        FindFromRequest findFromRequest = findRequestRetriever.retrieveFrom();
        FindToRequest findToRequest = findRequestRetriever.retrieveTo();
        FindThroughRequest findThroughRequest = findRequestRetriever.retrieveThrough();

        FlightFinderProcessor flightFinderProcessor = new FlightFinderProcessor(new FindFlightFrom(),
                new FindFlightTo(), new FindFlightThrough());
        flightFinderProcessor.process(findFromRequest, findToRequest, findThroughRequest);
    }
}
