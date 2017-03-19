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

    public String displayStats(){
        StringBuilder sb = new StringBuilder();
        sb.append("Frequency Stats:\n");
        sb.append("North:\t\t");
        sb.append("South:\t\t");
        sb.append("East:\t\t");
        sb.append("West:\n");
        sb.append(directionCounts.get(Direction.NORTH));
        sb.append("\t\t\t");
        sb.append(directionCounts.get(Direction.SOUTH));
        sb.append("\t\t\t");
        sb.append(directionCounts.get(Direction.EAST));
        sb.append("\t\t\t");
        sb.append(directionCounts.get(Direction.WEST));


        return  sb.toString();
    }
}
