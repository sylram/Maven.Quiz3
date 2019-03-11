package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String.valueOf(str.charAt(indexToCapitalize)).toUpperCase();
        char charToReplace = str.charAt(indexToCapitalize);

        String changed = "";
//        for (int i = 0; i <str.toCharArray().length ; i++) {
//            changed += str.toCharArray()[i]
//
//        }
//        for(char n : str.toCharArray()){
//            Character.toUpperCase(indexToCapitalize);
//        }


        return str.replace(charToReplace,Character.toUpperCase(charToReplace));
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Character given = baseString.charAt(indexOfString);
        if (given.equals(characterToCheckFor)) {
            return true;
        }return false;

    }

    public static String[] getAllSubStrings(String string) {

        List<String> subs = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i +1; j < string.length()+1; j++) {
                subs.add(string.substring(i, j));

            }



        }Set<String> elements = new HashSet<String >(subs);
        return elements.toArray(new String[elements.size()]);
    }

    public static Integer getNumberOfSubStrings(String input) {

      Integer number = getAllSubStrings(input).length;


        return number;
    }
}
