package BusTypes;

import Routes.Routes;
import Traveller.*;

import java.util.ArrayList;
import java.util.HashMap;

//Strategy Design Pattern:
//This class is a concrete class that implements the interface Bus.
public class LargeBus implements Bus
{
    private String name;
    private int busID;
    private ArrayList<TravellerInter> travellers;
    private int capacity;
    private int averageSpeed;
    private int distance;
    private final String Deck="Double Deck";
    private Routes route;
    private String source;
    private HashMap<String, ArrayList<TravellerInter>> destinationTravellerMap;
    private String destination;
    private int progress=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int getProgress() {
        return progress;
    }

    @Override
    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public ArrayList<TravellerInter> getTravellers() {
        return travellers;
    }

    @Override
    public Routes getRoute() {
        return route;
    }

    @Override
    public void setRoute(Routes route) {
        this.route = route;
    }

    public void setTravellers(ArrayList<TravellerInter> travellers) {
        this.travellers = travellers;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getSource() {
        return source;
    }

    public String getDeck() {
        return Deck;
    }

    public HashMap<String, ArrayList<TravellerInter>> getDestinationTravellerMap() {
        return destinationTravellerMap;
    }

    public void setDestinationTravellerMap(HashMap<String, ArrayList<TravellerInter>> destinationTravellerMap) {
        this.destinationTravellerMap = destinationTravellerMap;
    }

}
