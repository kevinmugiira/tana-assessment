import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question7_RotateString {

    public List<String> rotateString(List<String> myList, int a) {
        if (myList == null || myList.size() < 1) return null;

        // check if a is within the size of the list
        a = a % myList.size();

        List<String> store = new ArrayList<>();

        for (int p = myList.size() - a; p < myList.size(); p++) {
            store.add(myList.get(p));
        }

        for (int w = 0; w < myList.size() - a; w++) {
            store.add(myList.get(w));
        }

        return store;
    }

    public List<String> rotateString2(List<String> myList, int a) {
        Collections.rotate(myList, a);
        return myList;
    }

    public static void main(String[] args) {
        Question7_RotateString q = new Question7_RotateString();
        List<String> list = new ArrayList<String>();
        list.add("ID_A01");
        list.add("ID_A02");
        list.add("ID_A03");
        list.add("ID_A04");
        list.add("ID_A05");
        list.add("ID_A06");

        int k = 2;
        System.out.println("output for moveString: " + q.rotateString(list, k).toString());
        System.out.println("output for moveString2: " + q.rotateString2(list, k).toString());
    }
}

