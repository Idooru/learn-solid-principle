package ocp;

import java.util.Arrays;
import java.util.List;

public class DriverWithOcp {
    public static void main(String[] args) {
        Vehicle[] driver = new Vehicle[3];

        driver[0] = new PassengerCar();
        driver[1] = new BusAfter();
        driver[2] = new TruckAfter();

        List<Vehicle> driverList = Arrays.asList(driver);

        driverList.forEach((s) -> {
            String tx = s.drive();
            System.out.println(tx + "!");
        });
    }
}
