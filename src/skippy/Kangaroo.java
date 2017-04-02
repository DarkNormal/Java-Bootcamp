package skippy;

import static skippy.Direction.fromDirection;

/**
 * Created by mark on 19/03/17.
 */
public class Kangaroo {

    private Point location;
    private String name;
    private Point home;

    public Kangaroo(Point location, String name, Point home) {
        this.location = location;
        this.name = name;
        this.home = home;
        this.location = new Point(0,0);
    }

    public Point hop(Dice dice){
        Direction direction = dice.throwDice();
        Point pointToMoveBy = fromDirection(direction);
        Point newLocation = new Point(location.getPointX(), location.getPointY());
        newLocation.addPointTo(pointToMoveBy);
        return newLocation;
    }

    public boolean atHome(){
        if(location.comparePoints(location,home)){
            return true;
        }
        else return false;
    }
    public void move(Point newLocation){
        location.moveTo(newLocation);
        System.out.println("Hopped to: (" + location.getPointX() + ", " + location.getPointY() + ")!");
    }
}
