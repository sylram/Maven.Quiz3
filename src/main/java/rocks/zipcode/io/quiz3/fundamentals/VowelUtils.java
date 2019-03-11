package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if (word.contains(String.valueOf(vowels[i]))) {
                return true;
            }
        } return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        int index = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        if (hasVowels(word)) {

            for (int i = 0; i < vowels.length; i++) {
                if(word.indexOf(index)==vowels[i])
                    index++;
                index = word.indexOf(vowels[i]);
                return index;
            }
        }


        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;

    }

    public static Boolean isVowel(Character character) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Character.toLowerCase(character);
//        for (char n : vowels) {
            if (character=='a'||character=='e'||character=='i'||character=='o'||character=='u') {
                return true;
            }

        return false;
    }
}
