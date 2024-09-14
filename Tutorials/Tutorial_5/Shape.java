package Tutorials.Tutorial_5;

public class Shape
{
    private String color;
    private Point position;

    public Shape(Point position, String color) {
        this.color = color;
        this.position = position;
    }

    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Shape[position=%s, color=%s]", position, color);
    }
}
