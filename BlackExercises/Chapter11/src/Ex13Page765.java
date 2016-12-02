import java.util.*;


/**
 * Created by jasperhessellund on 09/09/16.
 */
//Done
public class Ex13Page765 {
    public static void main(String[] args) {
        HashMap<String, String> hMap1 = new HashMap<String, String>();
        hMap1.put("Kendrick","Perkins");
        hMap1.put("Stuart","Reges");
        hMap1.put("Jessica","Miller");
        hMap1.put("Bruce","Reges");
        hMap1.put("Hal","Perkins");
        System.out.println(isUnique(hMap1));

    }
    public static boolean isUnique (HashMap<String, String> hMap1) {
        LinkedList<String> list1 = new LinkedList<String>();

        HashMap<String, Integer> hMap2 = new HashMap<String, Integer>();

        for (String s : hMap1.values()) {
            list1.add(s);

        }

        for(String s: list1) {

            if(hMap2.keySet().contains(s)) {
                hMap2.put(s,hMap2.get(s)+1);

            }
            else {
                hMap2.put(s,1);
            }
        }
        for (String s : hMap2.keySet()) {
            int occurrece = hMap2.get(s);
            if (occurrece >= 2) {

                return true;
            }


        }
        return false;

    }
}

