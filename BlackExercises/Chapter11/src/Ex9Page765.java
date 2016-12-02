import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by jasperhessellund on 01/09/16.
 */
//Done

public class Ex9Page765 {
   public static void main(String[] args) {
        SortedSet<Integer> set1 = new TreeSet<Integer>();
        Collections.addAll(set1, 1, 2, 5);
       System.out.println(hasEven(set1));
    }
    public static boolean hasEven (SortedSet<Integer> set1) {

        Iterator<Integer> it1 = set1.iterator();
        int count = 0;

        while (it1.hasNext()) {
            if (it1.next()%2==0) {
                count++;

            }

        }
        if (count>0) {
            return true;
        }
        else {
            return false;
        }
    }

}
