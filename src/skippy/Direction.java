package skippy;

/**
 * Created by mark on 19/03/17.
 */
public enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public static Direction fromInteger(int x){
        switch (x){
            case 1:
                return NORTH;
            case 2:
                return SOUTH;
            case 3:
                return EAST;
            case 4:
                return WEST;
        }
        return null;
    }
    public static Point fromDirection(Direction direction){

        switch (direction){
            case NORTH:
                return new Point(0,1);
            case EAST:
                return new Point(1,0);
            case SOUTH:
                return new Point(0,-1);
            case WEST:
                return new Point(-1,0);
        }
        return new Point(0,0);
    }
}
