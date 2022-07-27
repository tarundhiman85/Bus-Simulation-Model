package FoodType;

import Traveller.TravellerInter;

public abstract class foodDecorator implements TravellerInter {
    protected TravellerInter traveller;
    public foodDecorator(TravellerInter traveller){
        this.traveller=traveller;
    }
}
