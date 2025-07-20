import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.List;

public class Question1_GetLongestString {

    /*
       - iterate through each string and check if it has repetitive identical characters
       - pick strings with non-repetitive identical characters and store them somewhere
       - check if characters in the strings are within the list of acceptable characters
       - check the longest string from what you have and output it
     */
    public String longest(String myChars, List<String> myStrings) {

        // handle edge cases
        if (myChars.length() == 0 || myStrings.size() == 0) {
            return "";
        }

        String longest = "";
        List<String> myRepeat = new ArrayList<>();
        List<String> allowed = new ArrayList<>();
        List<Character> myCharacters = new ArrayList<>();

        // convert the string argument to characters and store them in a list
        for (char c : myChars.toCharArray()) {
            myCharacters.add(c);
        }

        /*
           iterate through the list of strings checking whether there are any repetitive characters in each
           string. For the strings with repetitive characters, store them in a list
         */
        for (String a : myStrings) {
            if (a == null || a.length() < 2) System.out.println(a + " is null or too short!");

            for (int w = 0; w < a.length() - 1; w++) {
                if (a.charAt(w) == a.charAt(w + 1)) {
                    myRepeat.add(a);
                }
            }
        }

        /*
           modify myStrings and remove from it, all elements that are in myRepeat list
           this will leave myStrings with only the non-repetitive strings
         */
        List<String> modified = new ArrayList<>(myStrings);
        modified.removeAll(myRepeat);


        /*
           check if the characters in the strings in modified ie: list with non-repeating characters,
           are the allowed ones as per the string argument myChars which is now myCharacters list
         */
        for (String a : modified) {
            for (char b : myCharacters) {
                if (a.contains(String.valueOf(b))) {
                    allowed.add(a);
                }
            }
        }

        // find the longest string from the qualified string candidates and return it
        for (String str : allowed) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return longest;

    }

    public static void main(String[] args) {
        Question1_GetLongestString q = new Question1_GetLongestString();
        String myStr = "ABCD";
        List<String> testList = Arrays.asList("AABCDA","ABCDZADC","ABCDBCA","ABCDABDCA");
        System.out.println("longest string is: " + q.longest(myStr, testList));
    }
}

