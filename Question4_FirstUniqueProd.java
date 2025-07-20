import java.util.ArrayList;
import java.util.HashMap;

public class Question4_FirstUniqueProd {


    /*
      iterate the products array and get the number of times each product appears and store this in a map
      then via another iteration go through the map and check/get the first one and return it
     */
    public String firstUniqueProd(String[] products) {
        if (products.length == 0 || products.length == 1) {
            System.out.println("Invalid array input");
            return null;
        }

        HashMap<String, Integer> dupsMap = new HashMap<>();
        ArrayList<String> dupsList = new ArrayList<>();

        // check for duplicates and how many time they appear while storing them in dupsMap
        for (String product : products) {
            dupsMap.put(product.trim(), dupsMap.getOrDefault(product.trim(), 0) + 1);
        }

        // iterate through dupsMap, get the first element and return it
        for (String prod : dupsMap.keySet()) {

            if (dupsMap.get(prod.trim()) == 1) {
                return prod.trim();
            }

        }
        return null;
    }

    public static void main(String[] args) {

        Question4_FirstUniqueProd q4 = new Question4_FirstUniqueProd();
        String[] myArr = {"Apple","Computer","Apple","Bag"};
        System.out.println("output: " + q4.firstUniqueProd(myArr));
    }
}

