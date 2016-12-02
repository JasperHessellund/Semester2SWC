import java.util.*;

/**
 * Created by jasperhessellund on 10/10/2016.
 */
public class StackQueue {/*
    public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n); }
    }
    public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            int n = q.remove();
            s.push(n); }
    }
   public void splitStack () {

       Queue<Integer> q = new LinkedList<>();
       Stack<Integer> s = new Stack<>();


       Collections.addAll(s, 3, -5, 1, 2, -4);
        int size = s.size();
        while (!s.empty()) {
            int n = s.peek();
            if (n<0) {

                q.add(n);
            }


        }
       System.out.println(s);


       System.out.println(q);


   }
   public void stutter () {
       Stack<Integer> s = new Stack<>();
       Queue<Integer> q = new LinkedList<>();

       Collections.addAll(s, 3, 7, 1, 14, 9);
        while (!s.empty()) {
            int n = s.pop();
            q.add(n); q.add(n); q.add(n);
        }
       queueToStack(q,s);
       stackToQueue(s,q);
       queueToStack(q,s);
       System.out.println(s);
   }
    public void copyStack () {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s2 = new Stack<>();

        Collections.addAll(s, 3, 7, 1, 14, 9);
        while (!s.empty()) {
            int n = s.pop();
            q.add(n);


        }
        while (!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
            s2.push(n);
        }


        stackToQueue(s,q);
        queueToStack(q,s);
        stackToQueue(s2,q);
        queueToStack(q,s2);
        System.out.println(s2);
    }
*/

}
