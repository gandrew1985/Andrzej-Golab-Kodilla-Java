package com.kodilla.good.patterns.flights;

public class FindThroughRequest {

    private String from;
    private String to;

    public FindThroughRequest(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
