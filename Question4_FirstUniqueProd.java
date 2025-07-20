import java.util.ArrayList;
import java.util.HashMap;

public class Question4_FirstUniqueProd {

    public String firstUniqueProduct(String[] products) {
        if (products.length == 0 || products.length == 1) {
            System.out.println("Invalid array input");
            return null;
        }

        HashMap<String, Integer> dupsMap = new HashMap<>();
        ArrayList<String> dupsList = new ArrayList<>();

        for (String product : products) {
            dupsMap.put(product.trim(), dupsMap.getOrDefault(product.trim(), 0) + 1);
        }

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
        System.out.println("output: " + q4.firstUniqueProduct(myArr));
    }
}

