package Tutorials.Tutorial_4;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(Circle c, double height){
        super(c.getCenter(), c.getRadius());
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.getCircumference() *height + 2 * super.getArea();
    }

    public double getVolume(){
        return super.getArea() * height;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCylinder{" +
                "height=" + height +
                '}';
    }
}
