import java.util.HashMap;
import java.util.Map;

/**
 * Created by jasperhessellund on 10/09/16.
 */
//Done
public class Ex14Page765 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        map1.put("Janet",87);
        map1.put("Logan",62);
        map1.put("Whitaker",46);
        map1.put("Alyssa",100);
        map1.put("Stefanie",80);
        map1.put("Jeff",88);
        map1.put("Kim",52);
        map1.put("Sylvia",95);
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);
        //Logan Stefanie Jeff Kim
        intersect(map1, map2);







    }
    public static void  intersect (HashMap<String, Integer> map1, HashMap<String, Integer> map2) {

        HashMap<String, Integer> map3 = new HashMap<String, Integer>();
        //Taking entry (Key & value) from map one
        for (Map.Entry<String, Integer> entry: map1.entrySet()) {
                //Making attributes for each
                String key1 = entry.getKey();
                int value1 = entry.getValue();
                //Taking entry from map two
                for (Map.Entry<String, Integer> entry2: map2.entrySet()) {
                    //Making attributes to compare with the last attributes
                    String key2 = entry2.getKey();
                    int value2 = entry2.getValue();
                    //if the keys and the values is equal to each other
                    if (key1==key2&&value1==value2) {
                        //It will add to a new map separating from the other ones in map2&map1
                        map3.put(key1, value1);



                    }
            }

        }
        System.out.println(map3);

    }


}
