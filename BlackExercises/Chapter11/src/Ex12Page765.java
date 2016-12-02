import java.util.*;

/**
 * Created by jasperhessellund on 09/09/16.
 */
//Done
public class Ex12Page765 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("hi");
        list1.add("hi");
        list1.add("hi");
        System.out.println(contains3(list1));
    }
    public static boolean contains3 (LinkedList<String> list1) {

        HashMap<String, Integer> hMap1 = new HashMap<String, Integer>();

        for(String s: list1) {

            if(hMap1.keySet().contains(s)) {
                hMap1.put(s,hMap1.get(s)+1);

            }
            else {
                hMap1.put(s,1);
            }
        }
        for (String s : hMap1.keySet()) {
            int occurrece = hMap1.get(s);
            if (occurrece >= 3) {

                return true;
            }
        }
        return false;
    }



}
