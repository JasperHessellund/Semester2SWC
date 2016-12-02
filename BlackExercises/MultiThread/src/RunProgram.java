/**
 * Created by jasperhessellund on 01/12/2016.
 */
public class RunProgram {

    private static int[] array = new int[4321481];


    public static void main(String[] args) throws InterruptedException {
        Exercises e = new Exercises();
        Thread t = new Thread(new Exercises.ReverseHello());
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println("(MaxValue) "+e.maxValue(array));
        System.out.println();
        System.out.println("(ReverseHello)");
        t.start();



    }
}
