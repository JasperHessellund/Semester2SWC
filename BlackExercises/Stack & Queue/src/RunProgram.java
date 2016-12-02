/**
 * Created by jasperhessellund on 10/10/2016.
 */
public class RunProgram {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack(10);


        //s.randomAllStack(0,100);
        s.printTabel();
        s.print();
        s.pushAll("1,1,1,1");

        s.print();
    }
}
