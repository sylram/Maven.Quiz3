package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        ArrayList<Integer> container = new ArrayList<>(Arrays.asList(squaredValues));

        Integer [] squareInput = new Integer[input.length];
        for (int i = 0; i <input.length ; i++) {
            squareInput[i] = (input[i]*input[i]);
        }

        for (Integer base:squareInput) {
            if(container.contains(base)){
                return true;
            }

        }



        return false;
    }


}
