import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by jasperhessellund on 20/10/2016.
 */
public class RunProgram {

    protected static Integer[] iList = {3,2,1,4,5,1};
    protected static String[] sList = {"Lisa", "aohn", "lasse"};

    public static void main(String[] args) {
        Exercises<Integer> e = new Exercises<>();

        e.bubbleSort(iList);
        e.printMerge(iList);
        e.quickSort(iList);

    }
}
