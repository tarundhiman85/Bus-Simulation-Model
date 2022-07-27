package Simulation;
import BusTypes.Bus;
import BusTypes.BusFactory;
import DestinationAndSource.Destination;
import DestinationAndSource.Source;
import FoodType.Water;
import FoodType.beer;
import FoodType.coke;
import Routes.Routes;
import Traveller.*;
import java.sql.SQLOutput;
import java.util.*;

/*
Design Principles:
1. Program to an interface, not an implementation.
2. Favour Composition over Inheritance.
3. Strive for loosely coupled designs that interact only via interfaces.
4. Classes Should be open for extension, but closed for modification.
5. Encapsulate implementation details in classes, not in global variables.
6. Classes should have only one reason to change.
7. Take the part that vary and encapsulate it in a class, so that later on you can change the part without effecting the other.

Design Patterns Used:
1. Strategy Pattern: define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.(Behavioural)
2. Factory Pattern:we create object without exposing the creation logic to the client and refer to newly created object using a common interface.(Creation)
3. Iterator Pattern:  that lets you traverse elements of a collection without exposing its underlying representation (behavioral)
4. Builder Pattern: pattern that lets you construct complex objects step by step. (Creation Design Pattern)
5. Decorator Pattern:n pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper
   objects that contain the behaviors. (Structural)
* */
public class Simulation {
    private Integer busCount;
    private ArrayList<Routes> routes;
    private ArrayList<Bus> buses;

    public Integer getBusCount() {
        return busCount;
    }

    public void setBusCount(Integer busCount) {
        this.busCount = busCount;
    }

    public ArrayList<Routes> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Routes> routes) {
        this.routes = routes;
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public static void main(String[] args) {
        //Creating a Route
        Scanner sc = new Scanner(System.in);
        Simulation simulation = new Simulation();
        System.out.println("Enter the number of routes: ");
        int routeCount = sc.nextInt();
        ArrayList<Routes> routes = new ArrayList<Routes>();
        for (int i1 = 0; i1 < routeCount; i1++) {
            System.out.println("Enter the source: ");
            String source = sc.next();
            System.out.println("Enter the destination: ");
            String destination = sc.next();
            System.out.println("Enter the distance: ");
            int distance = sc.nextInt();
            Routes route = new Routes();
            route.setSource(source);
            route.setDestination(destination);
            route.setDistance(distance);
            routes.add(route);
            System.out.println("How many busses do you want to create?");
            int numberOfBuses = sc.nextInt();
            simulation.setBusCount(numberOfBuses);
            int id = 0;
            for (int i = 0; i < numberOfBuses; i++) {

                System.out.println("Enter the bus type");
                System.out.println("1. Electric Bus");
                System.out.println("2. Large Bus");
                System.out.println("3. Mini Bus");
                int choice = sc.nextInt();
                //4
                String busType = switch (choice) {
                    case 1 -> "ElectricBus";
                    case 2 -> "LargeBus";
                    case 3 -> "MiniBus";
                    default -> "";
                };
                //Using Factory Pattern to create the bus

                Bus bus = BusFactory.getBus(busType);
                id++;
                bus.setBusID(id);
                System.out.println("Enter the bus name");
                sc.nextLine();
                String name = sc.nextLine();
                bus.setName(name);

                System.out.println("Enter the number of seats");
                int seats = sc.nextInt();
                bus.setCapacity(seats);
                bus.setDistance(distance);
                //enter the destination of the bus
                System.out.println("Enter the destination of the bus");
                String destinationOfBus = sc.next();
                bus.setDestination(destinationOfBus);
                //enter the source of the bus
                System.out.println("Enter the source of the bus");
                String sourceOfBus = sc.next();
                bus.setSource(sourceOfBus);
                ArrayList<TravellerInter> travellers = new ArrayList<>();
                //storing the list of travellers for each destination in a map
                HashMap<String, ArrayList<TravellerInter>> map = new HashMap<>();
                map.put(destination, new ArrayList<>());
                for (int j = 0; j < seats; j++) {
                    sc.nextLine();
                    TravellerInter traveller = new Traveller();
                    System.out.println("Enter the " + (j + 1) + "th traveller name");
                    String travellerName = sc.nextLine();
                    traveller.setName(travellerName);
                    System.out.println("Enter the age");
                    int age = sc.nextInt();
                    System.out.println("Enter the Source of the traveller");
                    String source1 = sc.nextLine();
                    Source source2 = new Source();
                    source2.setSource(source1);
                    traveller.setSource(source2);
                    traveller.setAge(age);
                    traveller.setBus(bus);
                    travellers.add(traveller);
                    map.get(destination).add(traveller);
                }
                bus.setTravellers(travellers);
                bus.setDestinationTravellerMap(map);
                route.getBuses().add(bus);
                simulation.setBuses(route.getBuses());

            }
            simulation.setRoutes(routes);

            for (Bus bus : route.getBuses())
            {
                for (TravellerInter traveller : bus.getTravellers())
                {
                    Destination destination1 = new Destination();
                    destination1.setDestination(destination);
                    traveller.setDestination(destination1);

                    //Builder Design Pattern
                    System.out.println("Does traveller "+traveller.getName()+" wants food?(yes/no) and if yes, what kind of food veg/non-veg");
                    String food = sc.next();
                    String typeOfFood = sc.next();
                    //Using Builder Pattern to create the traveller
                    if (food.equals("yes") && typeOfFood.equals("veg")) {
                        traveller.WantFood().FoodType("veg");
                    }
                    if (food.equals("yes") && typeOfFood.equals("non-veg")) {
                        traveller.WantFood().FoodType("non-veg");
                    }
                }
            }
            //Now a users want to ask for the list of travellers for a particular destination
            System.out.println("Enter the destination");
            String destination1 = sc.next();
            System.out.println(route.getBuses());

            //Iterator Pattern: Iterator is used to iterate through the list of buses (Behavioral Design Pattern)
            for (Bus bus : route.getBuses()) {
                for (TravellerInter traveller : bus.getTravellers()) {
                    if (traveller.getDestination().getDestination().equals(destination1)) {
                        System.out.println(traveller.getName());
                    }
                }
            }
            //for all the busses in the route
            for (Bus bus : route.getBuses()) {
                for (TravellerInter traveller : bus.getTravellers()) {
                    if (traveller.isWantFood()) {
                        //we will ask for drinks
                        System.out.println("Does traveller "+traveller.getName()+" wants drinks?(yes/no) and if yes, what kind of drinks");
                        System.out.println("1. Water");
                        System.out.println("2. Coke");
                        System.out.println("3. Beer");
                        String drinkType = switch (sc.nextInt()) {
                            case 1 -> "water";
                            case 2 -> "coke";
                            case 3 -> "beer";
                            default -> "";
                        };
                        if (drinkType.equals("water")) {
                            traveller=new Water(traveller);
                            //get the new cost of the traveller
                            System.out.println("The cost of the traveller with water is "+traveller.getCost());
                        }
                        if (drinkType.equals("coke")) {
                            traveller=new coke(traveller);
                            //get the new cost of the traveller
                            System.out.println("The cost of the traveller with coke is "+traveller.getCost());
                        }
                        if (drinkType.equals("beer")) {
                            traveller=new beer(traveller);
                            //get the new cost of the traveller
                            System.out.println("The cost of the traveller with beer is "+traveller.getCost());
                        }
                    }
                }
            }
        }



    }
}
