package HW3_Architect.DIP;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new Petrol());
        car.start();

        car = new Car(new Diesel());
        car.start();
    }
}
