/**
 * Created by jasperhessellund on 01/12/2016.
 */
public class SumThread implements Runnable {

    private int maxValue = 0;
    private int[] arr;
    private int lo;
    private int hi;



    public SumThread(int[] arr, int lo, int hi) {
        this.arr = arr;
        this.lo = lo;
        this.hi = hi;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void run() {



        for(int i = lo; i < hi; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

    }
}
