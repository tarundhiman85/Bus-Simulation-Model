package BusTypes;

import Routes.Routes;
import Traveller.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

//Design Principle: Program to an interface, not an implementation.
//Strategy Design Pattern: Program to an Interface(supertype), not an Implementation.
//          - bus needs to track progress in the current route
public interface Bus {
    int getProgress();
    void setProgress(int progress);
    void setBusID(int id);
    void setName(String name);
    void setCapacity(int seats);
    void setDistance(int distance);
    void setTravellers(ArrayList<TravellerInter> travellers);
    void setDestination(String destination);
    void setDestinationTravellerMap(HashMap<String, ArrayList<TravellerInter>> destinationTravellerMap);
    String getName();
    ArrayList<TravellerInter> getTravellers();
    Routes getRoute();
    void setRoute(Routes route);
}
