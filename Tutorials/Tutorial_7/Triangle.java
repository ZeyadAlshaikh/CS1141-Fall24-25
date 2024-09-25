package Tutorials.Tutorial_7;

public final class Triangle extends TwoDimensionalShape
{
    private double sideA;
    private double sideC;
    private double base;
    private double height;

    public Triangle(Point position, String color, double height, double base, double sideA, double sideC) {
        super(position, color);
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return sideA + base + sideC;
    }

    @Override
    public String toString() {
        return  String.format("Triangle[base=%f, height=%f, sideA=%f, sideC=%f, %s]",
                base, height, sideA, sideC, super.toString());
    }

    public void resize(int percent){

        // percent = 10
        percent = percent/100;
        //percent 0.10
        // sideA = 10
        this.sideA += this.sideA * percent;

        // sideA = 10 + (10 * 0.1)
        this.sideC += this.sideC * percent;
        this.base += this.base * percent;
        this.height = this.height * ( this.height * percent);
    }
}