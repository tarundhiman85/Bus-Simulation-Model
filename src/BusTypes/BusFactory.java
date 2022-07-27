package BusTypes;
//Factory Design Pattern
public class BusFactory {
    public static Bus getBus(String busType) {
        if (busType == null) {
            return null;
        }
        if (busType.equalsIgnoreCase("ElectricBus")) {
            return new ElectricBus();
        } else if (busType.equalsIgnoreCase("MiniBus")) {
            return new MiniBus();
        } else if (busType.equalsIgnoreCase("LargeBus")) {
            return new LargeBus();
        } else {
            return null;
        }
    }
}
