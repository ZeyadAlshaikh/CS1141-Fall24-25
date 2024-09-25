package Tutorials.Tutorial_7;
public abstract class ThreeDimensionalShape extends Shape implements Movable
{
    public ThreeDimensionalShape(Point position, String color) {
        super(position, color);
    }
    
    public abstract double getVolume();

    public  void moveUp(){
        position.setY(position.getY()-1);
    }
    public void moveDown(){
        position.setY(position.getY()+1);
    }
    public void moveRight(){
        position.setX(position.getX()+1);
    }
    public void moveLeft(){
        position.setX(position.getX()-1);
    }


}
