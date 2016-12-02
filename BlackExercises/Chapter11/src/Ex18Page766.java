import java.util.*;

/**
 * Created by jasperhessellund on 14/09/16.
 */
//Done
public class Ex18Page766 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("42", "Marty");
        map1.put("81", "Sue");
        map1.put("17", "Ed");
        map1.put("31", "Dave");
        map1.put("56", "Ed");
        map1.put("3", "Marty");
        map1.put("29", "Ed");
        reverse(map1);
        System.out.println(map1);
    }
    public static void reverse (HashMap<String, String> map1) {
        HashMap<String, String> map2 = new HashMap<String, String>();
        LinkedList<String> keyList = new LinkedList<>();



        for(String value: map1.values()) {

            for (Map.Entry<String,String> entry1: map1.entrySet()) {

                String value1 = entry1.getValue();
                String key1 = entry1.getKey();
                if (value1.equals(value)) {
                    keyList.add(key1);
                }
            }
            map2.put(value, keyList.toString());
            keyList.clear();

        }

        map1.clear();
        map1.putAll(map2);
    }
}






