import java.util.*;

/**
 * Created by jasperhessellund on 01/09/16.
 */
//Done
public class Ex6Page765 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        countUnique(list1);



    }
    public static void countUnique (List<Integer> list1) {
        //makes HashSet to put ints in order and remove dublicates
        HashSet<Integer> cUnique = new HashSet<Integer>(list1);
        int count = 0;
        //for each loop to count
        for(Integer e: cUnique) {
            //counts
            count++;
        }
        //Prints the final result of the number of unique's
        System.out.println(count);








    }
}
