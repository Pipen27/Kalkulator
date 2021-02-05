package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Moscow", false);
        flights.put("Turin", true);
        flights.put("Madrid", true);
        flights.put("Berlin", false);

        for(Map.Entry<String, Boolean> entry : flights.entrySet()){
        if(entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue() == true) {
            System.out.println("Flight is founded");
        }else
         {
            throw new RouteNotFoundException("Flight is not possible to reach");
        }}
    return true;
    }
}
