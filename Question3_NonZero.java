import java.util.HashMap;

public class Question3_NonZero {



    public int turnZero(int[] arr) {
        if (arr.length < 1) {
            // return early for null
            return 0; 
        }
       // iterate while checking each element is greater than the sumTotal and if not add it to sumTotal
        int sumTotal = arr[0];
        for (int w = 1; w < arr.length; w++) {
            if (arr[w] > sumTotal) {
                return 1;
            }
            sumTotal = sumTotal + arr[w];
        }
        return 0;

    }

    public static void main(String[] args) {
        Question3_NonZero q = new Question3_NonZero();
        System.out.println("output: " + q.turnZero(new int[]{1,2,3}));
    }
}

