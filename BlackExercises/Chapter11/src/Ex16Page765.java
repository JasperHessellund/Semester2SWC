import java.util.HashMap;


/**
 * Created by jasperhessellund on 13/09/16.
 */
//Done
public class Ex16Page765 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("Marty", "206-9024");
        map1.put("Hawking","123-4567");
        //map1.put("Hawking","123-45672");
        map1.put("Smith","949-0504");
        map1.put("Newton","123-45671");

        System.out.println(is1to1(map1));
    }
    public static boolean is1to1 (HashMap<String, String> map1) {
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String key : map1.values()) {

            map2.put(key, 0);
        }
        //If map2 size is equal to map1 it means that there was no duplicate values

        return map2.size() == map1.size();
    }
}
