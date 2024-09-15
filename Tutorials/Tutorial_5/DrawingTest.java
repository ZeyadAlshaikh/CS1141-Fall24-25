package Tutorials.Tutorial_5;

public class DrawingTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        Point p = new Point(1,1);
        //Shape s1 = new Shape(p, "red");
        //TwoDimensionalShape d2 = new TwoDimensionalShape(p,"Black");
        Circle c1 = new Circle(p, "Geen", 3);
        Triangle t1 = new Triangle(p,"Yellow",10,5,9,7);

        shapes[0] = null; // s1;
        shapes[1] = null; //d2;
        shapes[2] = c1;
        shapes[3] = t1;

        Drawing d = new Drawing(shapes);
//
//        for( int i =0 ; i< shapes.length; i++){
//            System.out.println(d.shapeAt(i));
//            System.out.println(d.shapeAt(i).getArea());
//        }

        d.updateShape(new Rectangle(p,"Blue",10,15),0);
        d.updateShape(new Square(p,"Silver",5),1);

        System.out.println("Update shapes.......");
        for(Shape s: d.getShapes()){
            System.out.println(s);
            System.out.println(s.getArea());
            if( s instanceof TwoDimensionalShape)

                System.out.println("Perimeter :"+((TwoDimensionalShape)s).getPerimeter());
        }

    }
}
