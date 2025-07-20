import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Question6_MostCommon {

    public String common(String a) {
        // handle edge cases
        if (a.length() <= 1) return null;

        // convert the string arg provided to an array
        String[] elements = a.split(" ");

        StringBuilder b = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        // iterate through the array populating map with an element after each space
        // calculate number of times each string element appears and store in the map
        for (String str : elements) {
            map.put(str.trim(), map.getOrDefault(str.trim(), 0) + 1);
        }

        // iterate through map checking and recording any duplicated element
        for (String el : map.keySet()) {
            if (map.get(el) > 1) {
                list.add(el);
            }
        }

        // sort the map in ascending order
        Collections.sort(list);

        // debugging
        // System.out.println(list);

        // populate the string builder with the duplicates that appear more than twice
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            b.append(list.get(i));
            if (i < list.size() - 1) {
                b.append(",");
            }
        }

        // debugging
        System.out.println(b);
        return b.toString();
    }

    public static void main(String[] args) {

        Question6_MostCommon  q6 = new Question6_MostCommon ();
        String myStr = "hi there care to discuss algorithm basis or how to solve algorithm or";
        String str2 = "a,b,c,a,d,e,c,a,b,c";
        String result = q6.common(myStr);
        System.out.println("output: "+ result);
    }
}

