import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jasperhessellund on 31/08/16.
 */
//Done
public class Ex3Page764 {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16);
        removeEvenInRange(list1, 5, 13);
        System.out.println(list1);
    }

    public static void removeEvenInRange(List<Integer> list1, int startIndex, int endIndex) {
        Iterator<Integer> it1 = list1.iterator();
        int counter = 0, number = 0;
        while(it1.hasNext()) {

            if (startIndex <= counter && endIndex >= counter) {
                if (number%2==0) {
                    it1.remove();
                }
            }
        number = it1.next();
         counter++;
        }

    }
}
