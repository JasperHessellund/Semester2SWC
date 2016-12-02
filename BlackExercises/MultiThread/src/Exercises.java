/**
 * Created by jasperhessellund on 01/12/2016.
 */
public class Exercises {

    private int maxValue = 0;

    public long maxValue(int[] arr) throws InterruptedException {
        long first = System.currentTimeMillis();
        int length = arr.length;

        Thread[] thread = new Thread[4];
        SumThread[] sThread = new SumThread[4];

        for (int i = 0; i < 4; i++) {

            sThread[i] = new SumThread(arr, (i * length) / 4, ((i + 1) * length / 4));
            thread[i] = new Thread(sThread[i]);
            thread[i].start();

        }
        for (int i = 0; i < 4; i++) {

            thread[i].join();
            if (maxValue < sThread[i].getMaxValue()) {
                maxValue = sThread[i].getMaxValue();
            }

        }
        long last = System.currentTimeMillis();

        return last-first;


    }




    public static class ReverseHello implements Runnable {

        private int number = 0;
        private static int counter = 0;


        public ReverseHello() {

            counter++;
            number = counter;
        }

        @Override
        public String toString() {
            return "Hello from thread " + number + "!";
        }

        @Override
        public void run() {

            while (counter != 50) {

                Thread thread = new Thread(new ReverseHello());

                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
            System.out.println(this);

        }


    }
}





