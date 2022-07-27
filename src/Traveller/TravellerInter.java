package Traveller;

import BusTypes.Bus;
import DestinationAndSource.Destination;
import DestinationAndSource.Source;

import java.util.ArrayList;

public interface TravellerInter {
     boolean isWantFood();
     void setBus(Bus bus);
     void setAge(int age);
     void setName(String name);
      String getName();
     TravellerInter WantFood();
     void setDestination(Destination destination);
     void setSource(Source source);
     Destination getDestination();
     Source getSource();
     void FoodType(String s);
     void setCost(int cost);
     int getCost();
}

