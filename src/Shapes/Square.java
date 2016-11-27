package Shapes;

public class Square {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * length;
    }
}
