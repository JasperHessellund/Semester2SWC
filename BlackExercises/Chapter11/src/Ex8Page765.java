import java.util.*;




/**
 * Created by jasperhessellund on 01/09/16.
 */
public class Ex8Page765 {
    //Done
    public static void main(String[] args) {
        HashSet<String> list1 = new HashSet<String>();
        Collections.addAll(list1, "hello", "hii", "helloooo");
        System.out.println(minLength(list1));
    }
    public static int minLength (HashSet<String> list1) {
        //HashSets sort so the smallest string comes first
        //Creates a attribute that takes the first index of the set
        String x = list1.iterator().next();
        //Checks the length of the first string in the set
        int length = x.length();

        //checks if list1 is empty
        if(list1.isEmpty()) {
            return 0;

        //if any of them is empty the code stops here
        }
        else {
            //returns the length of the smallest string
           return length;



        }


    }


}

