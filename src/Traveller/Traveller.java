package Traveller;

import BusTypes.Bus;
import DestinationAndSource.Destination;
import DestinationAndSource.Source;

import java.util.ArrayList;

public class Traveller implements TravellerInter {
    //private variables
    private String name;
    private int age;
    private int bagWeight;
    private int height;
    private int busID;
    private boolean wantFood=false;
    private String foodType;
    //each traveller is assigned to a bus
    private Destination destination;
    private Source source;
    private Bus bus;
    private int cost=0;

    public int getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(int bagWeight) {
        this.bagWeight = bagWeight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost+= cost;
    }

    public boolean isWantFood() {
        return wantFood;
    }


    public String getName() {
        return name;
    }



    //Builder Pattern
    public Traveller WantFood() {
        this.wantFood = true;
        return this;
    }

    @Override
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public Destination getDestination() {
        return this.destination;
    }

    @Override
    public Source getSource() {
        return this.source;
    }

    @Override
    public void FoodType(String s) {
        this.foodType = s;
    }



    //Changing behaviour Runtime(Strategy Pattern)
    public void setBus(Bus bus) {
        this.bus = bus;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Traveller{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + bagWeight +
                ", height=" + height +
                ", busID=" + busID +
                ", bus=" + bus +
                '}';
    }

}
