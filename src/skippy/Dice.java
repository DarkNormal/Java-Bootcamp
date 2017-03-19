package skippy;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by mark on 19/03/17.
 */
public class Dice {
    HashMap<Direction, Integer> directionCounts = new HashMap<>();

    public Direction throwDice(){
        int randomNum = ThreadLocalRandom.current().nextInt(1,4 +1);
        Direction directionToMove = Direction.fromInteger(randomNum);
        Integer numCount = directionCounts.get(directionToMove);
        numCount = (numCount == null) ? 1 : ++numCount;
        directionCounts.put(directionToMove,numCount);
        return directionToMove;
    }

    public void displayStats(){
        System.out.println("Frequency Stats:");
        String format = "%-20s%-20s%-20s%-20s%n";
        System.out.printf(format, "North:", "South", "East", "West");
        System.out.printf(format, directionCounts.get(Direction.NORTH),
                directionCounts.get(Direction.SOUTH),
                directionCounts.get(Direction.EAST),
                directionCounts.get(Direction.WEST));
    }
}
