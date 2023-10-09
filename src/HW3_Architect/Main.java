package HW3_Architect;

import HW3_Architect.OCP.Bus;
import HW3_Architect.OCP.Car;
import HW3_Architect.OCP.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static void mainOcp() {
        Vehicle car = new Car(123);
        car.calculateAllowedSpeed();

        Vehicle bus = new Bus(60);
        bus.calculateAllowedSpeed();
    }
}
