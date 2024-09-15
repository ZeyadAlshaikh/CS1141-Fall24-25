package Tutorials.Tutorial_5;

public abstract class TwoDimensionalShape extends Shape
{
    public TwoDimensionalShape(Point position, String color) {
        super(position, color);
    }

    public abstract double getPerimeter();
    /*{
        System.out.println("Shape unknown! Cannot compute perimeter!");
        return 0;
    }*/
}