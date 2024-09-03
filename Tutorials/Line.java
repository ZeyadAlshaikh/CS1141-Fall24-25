package Tutorials;

public class Line {
    private Point begin, end;

    public Line( Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getBegin(){
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    @Override
    public String toString(){
        return String.format("Line[begin=(%d,%d),end=(%d,%d)]",begin.getX(),
                begin.getY(), end.getX(), end.getY() );
    }

    public double getLength(){

        return begin.distance(end);
    }
}
