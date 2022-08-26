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
        System.out.println("drive truck");
    }
}

class BusBefore {
    public void drive() {
        System.out.println("drive bus");
    }
}