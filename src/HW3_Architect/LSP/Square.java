package HW3_Architect.LSP;

public class Square extends Quadrangle {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }
}
