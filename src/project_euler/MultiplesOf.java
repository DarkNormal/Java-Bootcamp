package project_euler;

import java.util.ArrayList;

/**
 * Created by mark on 19/03/17.
 */
public class MultiplesOf {

    private ArrayList<Integer> multiplesList;

    void getMultiples(int value1, int value2, int limit){

        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            if(i % value1 == 0 || i % value2 == 0){
                multiples.add(i);
            }
        }
        multiplesList = multiples;
    }


     int getSumOfMultiples(){
        int sumOfMultiples = 0;
        for (Integer multiple : multiplesList) {
            sumOfMultiples += multiple;
        }
        return sumOfMultiples;
    }
}
