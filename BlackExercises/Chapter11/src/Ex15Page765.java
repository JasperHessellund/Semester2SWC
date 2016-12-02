import java.util.*;

/**
 * Created by jasperhessellund on 10/09/16.
 */
//Done
public class Ex15Page765 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 1, 1, 2, 2, 3, 4, 5, 2);
        maxOccurrence(list1);
    }

    public static void maxOccurrence(List<Integer> list1) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (Integer i : list1) {

                Integer map = map1.get(i);
                map1.put(i, (map == null ? 1 : map + 1));

        }

        int mode = 0;
        int max1 = 0;

        for (Map.Entry<Integer, Integer> i : map1.entrySet()) {
            int value = i.getValue();

            if (value > max1) {
                max1 = value;
                mode = i.getKey();

            }
        }
        if (mode>0) {
            System.out.println("The most frequent number in the list is "+mode+" by " +max1);
        }
        else {
            System.out.println("0");
        }

    }
}
