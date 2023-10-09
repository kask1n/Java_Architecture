package HW3_Architect.ISP;

public class Cylinder implements iShape2D, iShape3D {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius + 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}
