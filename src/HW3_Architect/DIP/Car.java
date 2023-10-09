package HW3_Architect.DIP;

public class Car {
    private final iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }

    public iEngine getEngine() {
        return engine;
    }

}
