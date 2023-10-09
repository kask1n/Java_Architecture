package HW3_Architect.ISP;

public class Triangle implements iShape2D {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double pp = (a + b + c) / 2.0; // Полупериметр.
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
