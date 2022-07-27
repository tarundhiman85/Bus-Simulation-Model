package DestinationAndSource;

import Traveller.TravellerInter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Source {
    private String source;
    Map<String, ArrayList<TravellerInter>> map = new HashMap<>();

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Map<String, ArrayList<TravellerInter>> getMap() {
        return map;
    }

    public void setMap(Map<String, ArrayList<TravellerInter>> map) {
        this.map = map;
    }
}
