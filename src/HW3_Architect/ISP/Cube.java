package HW3_Architect.ISP;

public class Cube implements iShape2D, iShape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side * 6;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
}
