import java.util.*;

/**
 * Created by jasperhessellund on 07/09/16.
 */
//Done
public class Ex7Page765 {

        public static void main(String[] args) {
            List<Integer> list1 = new LinkedList<Integer>();
            List<Integer> list2 = new LinkedList<Integer>();
            Collections.addAll(list1, 3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
            Collections.addAll(list2, -5, 15, 2, -1, 7, 15, 36);

            countCommon(list1, list2);
        }
        public static void countCommon (List<Integer> list1, List<Integer> list2) {
            HashSet<Integer> set1 = new HashSet<Integer>();
            HashSet<Integer> set2 = new HashSet<Integer>();
            Iterator<Integer> it1 = set1.iterator();
            Iterator<Integer> it2 = set2.iterator();
            set1.addAll(list1);
            set2.addAll(list2);

            int count = 0;
            for (Integer s: set1) {
                if (set2.contains(s)) {
                    count++;
                }
            }
            System.out.println(count);


        }
}



