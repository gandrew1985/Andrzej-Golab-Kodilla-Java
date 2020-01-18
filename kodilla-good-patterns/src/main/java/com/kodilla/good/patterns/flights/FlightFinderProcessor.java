package com.kodilla.good.patterns.flights;

public class FlightFinderProcessor {

    private FinderFrom finderFrom;
    private FinderTo finderTo;
    private FinderThrough finderThrough;

    public FlightFinderProcessor(final FinderFrom finderFrom, final FinderTo finderTo,
                                 final FinderThrough finderThrough) {
        this.finderFrom = finderFrom;
        this.finderTo = finderTo;
        this.finderThrough = finderThrough;
    }

    public FindDto process(FindFromRequest findFromRequest, FindToRequest findToRequest,
                           FindThroughRequest findThroughRequest) {
        boolean isFromFounded = finderFrom.find(findFromRequest.getDepartureAirport());
        boolean isToFounded = finderTo.findTo(findToRequest.getArrivalAirport());
        boolean isThroughFounded = finderThrough.findTrough(findThroughRequest.getFrom(),
                findThroughRequest.getTo());

        if (isFromFounded || isToFounded || isThroughFounded) {
            return new FindDto(findFromRequest.getDepartureAirport(), findToRequest.getArrivalAirport(),
                    true);
        } else {
            return new FindDto(findFromRequest.getDepartureAirport(), findToRequest.getArrivalAirport(),
                    false);
        }
    }
}