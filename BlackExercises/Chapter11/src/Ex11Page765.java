import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by jasperhessellund on 09/09/16.
 */
//Done
public class Ex11Page765 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        Collections.addAll(set1, 1, 4, 7, 9);
        Collections.addAll(set2, 2, 4, 5, 6, 7);
        symmetricSetDifference(set1, set2);


    }
    public static void symmetricSetDifference (HashSet<Integer> set1, HashSet<Integer> set2) {
        //
        Set<Integer> diff = new HashSet<Integer>(set1);
        diff.addAll(set2);
        Set<Integer> tmp = new HashSet<Integer>(set1);
        tmp.retainAll(set2);
        diff.removeAll(tmp);
        System.out.println(diff);


    }

}
