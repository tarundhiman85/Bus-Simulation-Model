package BusTypes;
import Routes.Routes;
import Traveller.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ElectricBus implements Bus
{
    private String name;
    private int busID;
    private ArrayList<TravellerInter> travellers;
    private int capacity;
    private int averageSpeed;
    private int distance;
    private final String Deck="Single Deck";
    private HashMap<String, ArrayList<TravellerInter>> destinationTravellerMap;
    private String destination;
    private Routes route;
    public String getName() {
        return name;
    }
    private int progress=0;

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


    public HashMap<String, ArrayList<TravellerInter>> getDestinationTravellerMap() {
        return destinationTravellerMap;
    }

    public void setDestinationTravellerMap(HashMap<String, ArrayList<TravellerInter>> destinationTravellerMap) {
        this.destinationTravellerMap = destinationTravellerMap;
    }

}
