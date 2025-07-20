import java.util.HashMap;

public class Question5_NearestMinimum {

    /*
      iterate through the array and find the minimum number that's appearing multiple times
      Then get the indexes of all this number's instances and find the difference between them
     */

    public Integer nearestMinimum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("array is empty");
        }

        HashMap<Integer, Integer> seenLast = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lastIndexToBeSeen = -1;
        Integer minimumNumber = null;
        Integer minimumDuplicate = null;
        int shortest = Integer.MAX_VALUE;

        // ensure that the argument numbers is not null
        assert numbers != null;

        // find and count the frequency of each number element in the array and store that in the map
        for (int myNumber : numbers) {
            map.put(myNumber, map.getOrDefault(myNumber, 0) + 1);
        }

        // iterate the map and find the minimum element that appears more than once
        // then record it as the smallest/minimum element
        for (int myNum : map.keySet()) {
            if (map.get(myNum) > 1) {
                if (minimumNumber == null || myNum < minimumNumber) {
                    minimumNumber = myNum;
                }
            }
        }

        // find all the occurences of the minimum element in the array argument
        for (int w = 0; w < numbers.length; w++) {
            if (numbers[w] == minimumNumber) {
                // check the last index of the minimum element is not -1 then calculate distance between the
                // element's last seen index and the current index
                if (lastIndexToBeSeen != -1) {
                    int dis = w - lastIndexToBeSeen;
                    shortest = Math.min(shortest, dis);
                }
                lastIndexToBeSeen = w;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {

        Question5_NearestMinimum q5 = new Question5_NearestMinimum();

        int[] arr = {1,2,3,1,4,5,2};
        System.out.println("output is: " + q5.nearestMinimum(arr));
    }
}

