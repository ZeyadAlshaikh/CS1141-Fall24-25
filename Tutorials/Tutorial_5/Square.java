package Tutorials.Tutorial_5;

public class Square extends Rectangle
{
    public Square(Point position, String color, double side) {
        super(position, color, side, side);
    }

    @Override
    public String toString() {
        return  String.format("Square[%s]", super.toString());
    }
}