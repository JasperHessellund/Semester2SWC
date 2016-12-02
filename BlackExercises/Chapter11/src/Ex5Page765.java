import java.util.*;

/**
 * Created by jasperhessellund on 01/09/16.
 */

//Done
public class Ex5Page765 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9);
        sortAndRemoveDuplicates(list1);

    }
    public static void sortAndRemoveDuplicates (List<Integer> list1) {
        //Easy når man bruger sorted set og treeset
        SortedSet<Integer> finalList = new TreeSet<Integer>(list1);

        System.out.println(finalList);

    }

}