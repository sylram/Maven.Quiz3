package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
        int size =0;
        for(char n: str.toCharArray()){
            if(Character.isAlphabetic(n)){
                size +=1;

            }
        }System.out.println(size);

        String[] split = new String[size];
//        char[] chars = input.toCharArray();

        int index = 0;
        for (int i = 1; i < split.length+1; i++) {
            split[index] = str.substring(0, index).toLowerCase() +
                    str.substring(index, i).toUpperCase() + str.substring(i, str.length()).toLowerCase();
            index++;

        }return split;
    }


}
