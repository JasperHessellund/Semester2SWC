import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by jasperhessellund on 08/09/16.
 */
//Done
public class Ex10Page765 {
    public static void main(String[] args) {
        HashSet<String> list1 = new HashSet<String>();
        Collections.addAll(list1, "hello", "hiii", "helloooo");

        removeOddLength(list1);
    }

    public static void removeOddLength(HashSet<String> list1) {
        //Makes a iterator and a forloop that checks for each string in the HashSet
        for (Iterator<String> it1 = list1.iterator(); it1.hasNext(); ) {
            //Makes a String attribute to be able to check the length of each String in the HashSet
            String s = it1.next();
            //Checks if the Length of the String is not even(% 2 != 0)
            if (s.length() % 2 != 0) {
                //removes if it's not even
                it1.remove();

            }

        }
        //Prints the set after the loop has checked the whole set
        System.out.println(list1);

    }
}
