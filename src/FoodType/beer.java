package FoodType;

import BusTypes.Bus;
import DestinationAndSource.Destination;
import DestinationAndSource.Source;
import Traveller.TravellerInter;

public class beer extends foodDecorator {
    public beer(TravellerInter traveller) {
        super(traveller);
    }

    @Override
    public boolean isWantFood() {
        return this.traveller.isWantFood();
    }


    @Override
    public void setBus(Bus bus) {
        this.setBus(bus);
    }

    @Override
    public void setAge(int age) {
        this.traveller.setAge(age);
    }

    @Override
    public void setName(String name) {
        this.traveller.setName(name);
    }

    @Override
    public String getName() {
        return this.traveller.getName();
    }

    @Override
    public TravellerInter WantFood() {
        return this.traveller.WantFood();
    }

    @Override
    public void setDestination(Destination destination) {
        this.traveller.setDestination(destination);
    }

    @Override
    public void setSource(Source source) {
        this.traveller.setSource(source);
    }

    @Override
    public Destination getDestination() {
        return this.traveller.getDestination();
    }

    @Override
    public Source getSource() {
        return this.traveller.getSource();
    }


    @Override
    public void FoodType(String s) {
        this.traveller.FoodType(s);
    }

    @Override
    public void setCost(int cost) {
        this.traveller.setCost(cost);
    }

    @Override
    public int getCost() {
        return 20+this.traveller.getCost();
    }
}
