package skippy;

import java.util.Scanner;

/**
 * Created by mark on 19/03/17.
 */
public class RunSkippy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gridSize;
        boolean validGridSize = true;

        do {
            System.out.println("Enter dimension of the Grid (>=1):");
            gridSize = in.nextInt();
            if(gridSize < 1){
                validGridSize = false;
                System.out.println("Invalid grid size!");
            }
            else validGridSize = true;
        } while (validGridSize != true);

        Grid grid = new Grid(gridSize);
        Kangaroo skippy = new Kangaroo(new Point(0,0), "Skippy", new Point(gridSize, gridSize));
        Dice dice = new Dice();
        while(skippy.atHome() != true){
            skippy.hop(dice);
            if(grid.liesOutsideBounds(skippy.getProposedLocation())){
                System.out.println("Oops, hit the boundary!");
                skippy.cancelMove();
            }
            else{
                skippy.move();
            }
        }
    }
}
