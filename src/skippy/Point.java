package skippy;

/**
 * Created by mark on 19/03/17.
 */
public class Point {

    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int x){
        pointX = x;
    }

    public int getPointY() {
        return pointY;
    }
    public void setPointY(int y){
        pointY = y;
    }

    public boolean comparePoints(Point a, Point b){
        if(a.getPointX() == b.getPointX() && a.getPointY() == b.getPointY())
            return true;
        else
            return false;
    }
    public void addPointTo(Point toMoveBy){
        pointX += toMoveBy.getPointX();
        pointY += toMoveBy.getPointY();
    }
    public void moveTo(Point toMoveTo){
        pointX = toMoveTo.getPointX();
        pointY = toMoveTo.getPointY();
    }
}
