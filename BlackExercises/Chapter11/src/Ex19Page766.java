import java.util.*;

/**
 * Created by jasperhessellund on 14/09/16.
 */
//Done
public class Ex19Page766 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

        map1.put("Janet", 72);
        map1.put("Logan", 72);
        map1.put("Whitaker", 10);
        map1.put("Alyssa", 10);
        map1.put("Stefanie", 10);
        map1.put("Jeff", 10);
        map1.put("Kim", 82);
        map1.put("john ", 82);

        //map1.put("Sylvia", 95);
        System.out.println(rarest(map1));


    }

    public static int rarest(HashMap<String, Integer> map1) throws Exception {

        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        List<Integer> list = new LinkedList<Integer>();
        if (map1.isEmpty()) {
            throw new Exception("Map is empty");
        }
        for (Integer i : map1.values()) {
            list.add(i);
        }

        for (Integer i : list) {

                Integer map = map2.get(i);
                map2.put(i,(map == null ? 1 : map + 1));
        }

        map1.clear();


        Integer min = Collections.min(map2.values());



        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            Integer key = entry.getKey();
            int value = entry.getValue();

            if (value==min) {
                map1.put(key.toString(), key);

            }


        }

        return Collections.min(map1.values());


    }
}