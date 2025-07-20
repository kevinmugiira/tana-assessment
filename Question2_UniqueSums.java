import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question2_UniqueSums {

    /*
        Calculate all possible additions of each array element to equal the result and with the array sorted
        check if the elements of the array qualify for the possible unique ways. Store in the map and output it.
     */


    int sumTotal = 0;
    public HashMap<Integer, List<List<Integer>>> uniq(int result, int[] myArr) {

        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        List<List<Integer>> additions = new ArrayList<>();
        StringBuilder strBuilder = new StringBuilder();
        int myCounter = 0;

        // sort the array
        Arrays.sort(myArr);
        iterations(myArr,result,0, new ArrayList<Integer>(), additions);

        map.put(sumTotal, additions);
        return map;
    }

    private void iterations(
            int[] myArr,
            int amount,
            int begin,
            List<Integer> position,
            List<List<Integer>> sum) {
        if (amount == 0) {
            sumTotal++;
            sum.add(new ArrayList<>(position));
            return;
        }

        for (int w = begin; w < myArr.length; w++) {
            if (w > begin && myArr[w] == myArr[w - 1]) {
                continue;
            }
            if (myArr[w] > amount) {
                break;
            }
            position.add(myArr[w]);
            iterations(myArr, amount, w + 1, position, sum);
            position.remove(position.size() - 1);
        }
    }

    public static void main(String[] args) {
        Question2_UniqueSums q = new Question2_UniqueSums();
        int result = 10;
        int[] arr = {1,2,3,4,5};
        System.out.println(q.uniq(result, arr));
    }
}

