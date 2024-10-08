package Tutorials.Tutorial_7;
public class Sphere extends ThreeDimensionalShape implements Movable
{
    private double radius;

    public Sphere(Point position, String color, double radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * (radius * radius);
    }
    
    @Override
    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(radius,3);
    }
    
    @Override
    public String toString() {
        return  String.format("Sphere[radius=%f, %s]", radius, super.toString());
    }

    public  void moveUp(){}
    public void moveDown(){}
    public void moveRight(){}
    public void moveLeft(){}
}
