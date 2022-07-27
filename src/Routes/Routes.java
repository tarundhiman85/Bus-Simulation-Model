package Routes;

import BusTypes.Bus;

import java.util.ArrayList;
import java.util.List;

public class Routes {
    //Design Principle: Favour Composition over Inheritance
    private ArrayList<Bus> buses=new ArrayList<>();
    private String source;
    private String destination;
    private int distance;
    public ArrayList<Bus> getBuses() {
        return buses;
    }
    public List<String> destinations=new ArrayList<>();
    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }
    public String getSource() {
        return source;
    }
    //Design Principle: Take the part that vary and encapsulate it in a class,
    // so that later on you can change the part without effecting the other

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "buses=" + buses +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", distance=" + distance +
                '}';
    }
}
