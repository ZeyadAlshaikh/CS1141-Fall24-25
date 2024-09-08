package Tutorials.Tutorial_4;

public class Tester {
    public static void main(String[] args) {

        Circle c1 = new Circle(new Point(0,0), 4);
//        System.out.println("Area: "+c1.getArea());
//        System.out.println("Circumference: "+c1.getCircumference());
//        System.out.println(c1);

        Cylinder cy = new Cylinder(c1, 10);
        System.out.println(cy);
        System.out.println("Cylinder Area: "+ cy.getArea());
        System.out.println("Cylinder Volume: "+cy.getVolume());


//        Point p1 = new Point(5,10);
//        Point p2 = new Point(0,0);
//
//        Line l1 = new Line(p1,p2);
//
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        System.out.println(l1);
//        System.out.println("Length of L1 is "+ l1.getLength());
    }
}
