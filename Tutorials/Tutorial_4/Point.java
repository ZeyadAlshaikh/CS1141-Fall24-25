package Tutorials.Tutorial_4;

public class Point {
    private int x, y;

    public Point() { // The default constructor
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // The public getters and setters
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    // Return "(x,y)"
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    // Set both x and y.
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getXY() {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(Math.pow(xDiff,2) + yDiff*yDiff);
    }
    public double distance(Point another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance() {

        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

}
