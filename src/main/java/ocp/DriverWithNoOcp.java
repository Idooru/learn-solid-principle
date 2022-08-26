package ocp;

public class DriverWithNoOcp {
    public static void main(String[] args) {
        TruckBefore truckDriver = new TruckBefore();
        truckDriver.drive();

        BusBefore busDriver = new BusBefore();
        busDriver.drive();
    }
}

class TruckBefore {
    public void drive() {
        System.out.println("트럭 운전");
    }
}

class BusBefore {
    public void drive() {
        System.out.println("버스 운전");
    }
}