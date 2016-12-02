import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jasperhessellund on 31/08/16.
 */
//Done
public class Ex2Page764 {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();


        Collections.addAll(list1, 1, 2, 3, 4, 5);
        Collections.addAll(list2, 6, 7, 8, 9, 10, 11, 12);

        System.out.println(alternate(list1, list2));
    }



    public static List<Integer> alternate (List<Integer> list1, List<Integer> list2) {
        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();
        List<Integer> toReturn = new LinkedList<Integer>();
        //checks size of each list and checks if it hasNext and runs as long as the biggest of the two lists with "?"
        while (list1.size()>list2.size()?it1.hasNext():it2.hasNext()) {
            //if the first iterator hasNext int it will add to the "toReturn" list
            if(it1.hasNext()) {
                toReturn.add(it1.next());
            }
            //if the second iterator hasNext int it will add to the "toReturn" list
            if (it2.hasNext()) {
                toReturn.add(it2.next());
            }

        }
        //returns the final output of the merged lists
        return toReturn;



    }
}

