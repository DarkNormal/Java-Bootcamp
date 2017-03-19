package skippy;

import static skippy.Direction.fromDirection;

/**
 * Created by mark on 19/03/17.
 */
public class Kangaroo {

    private Point proposedLocation;
    private Point actualLocation;
    private String name;
    private Point home;

    public Kangaroo(Point location, String name, Point home) {
        this.proposedLocation = location;
        this.name = name;
        this.home = home;
        this.actualLocation = new Point(0,0);
    }

    public Point getProposedLocation() {
        return proposedLocation;
    }

    public void hop(Dice dice){
        Direction direction = dice.throwDice();
        Point pointToMoveBy = fromDirection(direction);
        proposedLocation.move(pointToMoveBy);
    }

    public boolean atHome(){
        if(proposedLocation.comparePoints(proposedLocation,home)){
            return true;
        }
        else return false;
    }
    public void move(){
        actualLocation.moveTo(proposedLocation);
        System.out.println("Hopped to: (" + actualLocation.getPointX() + ", " + actualLocation.getPointY() + ")!");
    }
    public void cancelMove(){
        proposedLocation.setPointX(actualLocation.getPointX());
        proposedLocation.setPointY(actualLocation.getPointY());
    }
}
