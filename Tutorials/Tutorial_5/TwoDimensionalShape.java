package Tutorials.Tutorial_5;

public class TwoDimensionalShape extends Shape
{
    public TwoDimensionalShape(Point position, String color) {
        super(position, color);
    }

    public double getPerimeter() {
        System.err.println("Shape unknown! Cannot compute perimeter!");
        return 0;
    }
}