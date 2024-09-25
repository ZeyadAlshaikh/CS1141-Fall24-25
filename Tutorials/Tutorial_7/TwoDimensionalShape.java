package Tutorials.Tutorial_7;

public abstract class TwoDimensionalShape extends Shape implements Resizable
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