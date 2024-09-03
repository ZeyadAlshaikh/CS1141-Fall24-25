package Tutorials;

import java.nio.channels.Pipe;

public class Circle {
    protected double radius;
    private Point center;

    public Circle() {
        this(new Point(), 1.0); // Construct a Point at (0,0)
    }
    public Circle(double radius) {
        this(new Point(), radius); // Construct a Point at (0,0)
    }
    public Circle(int xCenter, int yCenter, double radius) {
        this (new Point(xCenter, yCenter), radius);
    }
    public Circle(Point center, double radius) {
        this.center = center; // The caller constructed an Point instance
        this.radius = radius;
    }
    // Getters and Setters

    public Point getCenter() {
        return this.center;  // return a Point instance
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int[] getCenterXY(){
        int[] xy = new int[2];
        xy[0] = center.getX();
        xy[1] = center.getY();
        return xy;
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

}
