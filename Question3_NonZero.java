import java.util.HashMap;

public class Question3_NonZero {

//    public HashMap<Integer, Integer> allZero(int[] myArr) {
//        if (myArr == null) {return null;}
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//
//        for (int i = 1; i < myArr.length; i++) {
//            if (myArr[i] - myArr[i - 1] == 0 ) {
//                myArr[i] = 0;
//                map.put(i, 1); //map.getOrDefault(i, 0) + 1);
//                return map.get(i);
//            } else {
//                map.put(i, 0);
//                return map.get(i);
//            }
//        }
//        return map;
//    }


    public int turnToZero(int[] myArr) {
        if (myArr.length < 1) {
            return 0; // Early return for null input
        }
        int indexTotal = myArr[0];
        for (int w = 1; w < myArr.length; w++) {
            if (myArr[w] > indexTotal) {
                return 1;
            }
            indexTotal = indexTotal + myArr[w];
        }
        return 0;

    }

    public static void main(String[] args) {
        Question3_NonZero q = new Question3_NonZero();
        System.out.println("output: " + q.turnToZero(new int[]{1,2,3}));
    }
}

