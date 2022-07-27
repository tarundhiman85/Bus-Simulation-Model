package DestinationAndSource;

import Traveller.TravellerInter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Destination {
    private String destination;
    Map<String, ArrayList<TravellerInter>> m = new HashMap<>();

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Map<String, ArrayList<TravellerInter>> getM() {
        return m;
    }

    public void setM(Map<String, ArrayList<TravellerInter>> m) {
        this.m = m;
    }
}
