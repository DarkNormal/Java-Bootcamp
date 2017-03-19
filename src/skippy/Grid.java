package skippy;

/**
 * Created by mark on 19/03/17.
 */
public class Grid {

    private int gridSize;

    public Grid(int gridSize) {
        this.gridSize = gridSize;
    }

    public boolean liesOutsideBounds(Point point){
        if(!(valueWithinBounds(point.getPointX()))  || !(valueWithinBounds(point.getPointY()))){
            return true;
        }
        else return false;
    }

    private boolean valueWithinBounds(int val){
        if(val <= gridSize && val >= 0)
            return true;
        else return false;
    }
}
