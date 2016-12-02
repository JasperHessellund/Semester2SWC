import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by jasperhessellund on 06/10/2016.
 */
public class RunProgram {
    public static void main(String[] args) {
        HashIntSet h = new HashIntSet();
        HashIntSet h2 = new HashIntSet();
        h.add(-5);h.add(1);h.add(2);h.add(3);
        h2.add(2);h2.add(3);h2.add(6);h2.add(44);h2.add(79);
        System.out.println(h.size());
        System.out.println(h2.size());
        System.out.println(h);
        h.addAll(h2);
        System.out.println(h);
        h.clear();h2.clear();
        h.add(-2);h.add(3);h.add(5);h.add(6);h.add(8);
        h2.add(8);h2.add(3);h2.add(6);h2.add(7);
        System.out.println(h.containsAll(h2));

        h.clear();h2.clear();
        h.add(1);h.add(2);h.add(3);h.add(4);
        h2.add(1);h2.add(2);h2.add(3);h2.add(2);
        System.out.println("(Ex 3) "+h.equals1(h2));


        h.clear();h2.clear();
        h.add(-2);h.add(3);h.add(5);h.add(6);h.add(8);
        h2.add(2);h2.add(3);h2.add(6);h2.add(8);h2.add(11);

        h.removeAll(h2);
        System.out.println(h);

        h.clear();h2.clear();
        h.add(-2);h.add(3);h.add(5);h.add(6);h.add(8);
        h2.add(2);h2.add(3);h2.add(6);h2.add(8);h2.add(11);

        h.retainAll(h2);
        System.out.println("(retainAll) "+h);


        System.out.println(Arrays.toString(h.toArray()));

        System.out.println(h.toString());






       // System.out.println("Ex 6: "+h.toString1());

    }
}
