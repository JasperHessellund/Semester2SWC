import java.util.HashMap;
import java.util.Map;

/**
 * Created by jasperhessellund on 13/09/16.
 */
//Done
public class Ex17Page766 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        map1.put("Smith", "949-0504");
        map1.put("Marty", "206-9024");
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith","949-0504");
        map2.put("Newton", "123-4567");
        System.out.println(subMap(map1, map2));


    }

    public static boolean subMap (HashMap<String, String> map1, HashMap<String,String> map2) {
        //Checks if map1 is empty
        int count = 0;
        if (map1.isEmpty()) {
            //if it is it will return true because "The empty map is a submap of every map"
            return true;
        }
        //if it is not empty it will run the subMap code
        else {
            //gets both key and value for map1
            for (Map.Entry<String, String> entry1 : map1.entrySet()) {
                String key1 = entry1.getKey();
                String value1 = entry1.getValue();
                //same for map2
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    String key2 = entry2.getKey();
                    String value2 = entry2.getValue();
                    //checks if key and value contains the same for each map
                    if (key1.contains(key2) && value1.contains(value2)) {
                        //returns true if it does
                        count++;
                    }

                }
            }

            //returns false if non of the code above is true
            return count == map1.size();
        }
    }
}