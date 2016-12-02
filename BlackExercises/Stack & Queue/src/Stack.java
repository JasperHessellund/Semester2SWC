import java.util.Arrays;

/**
 * Created by jasperhessellund on 14/11/2016.
 */
public class Stack<E extends Number> {

    private E[] stackArray;
    private int stackSize;
    private int topStack = -1;

    Stack(int size) {
        stackSize = size;
        stackArray = (E[]) (new Number[size]);
        Arrays.fill(stackArray, "null");
    }

    //Add
    public void push (E input) {

        if (topStack + 1 < stackSize) {
            topStack++;

            stackArray[topStack] = input;

        } else throw new ArrayIndexOutOfBoundsException("Stack is full");





    }

    public void pushAll (String values) {
        //Could not figure out how to split both spaces and commas, so i found the split code online.
        Object[] tempArr = values.split("\\s*(=>|,|\\s)\\s*");
        for (int i = 0; i < tempArr.length; i++) {

            push((E) tempArr[i]);
        }
    }
    //Gets the top value and removes it
    public E pop() {
        if (topStack>=0) {


            stackArray[topStack] = null;
            return stackArray[topStack--];
        }
        else {

            System.out.println("You cannot pop empty Stacks");
            return null;
        }

    }
    //Gets the top value without removing it
    public E peek() {
        return stackArray[topStack];

    }



    public void print () {

        for (int i = 0; i < stackSize; i++) {
            if (stackArray[i].equals("null")) {
                System.out.print("");
            } else
            System.out.print(stackArray[i]+" ");
        }
        System.out.println();
    }



    public int getStackSize() {
        return stackSize;
    }

    //randomize all of the stack values
    /*public void randomAllStack (int min, int max) {
        for (int i = 0; i < stackSize; i++) {
            int random = (int) (Math.random() * max+ min);

            push(random);
        }
    }*/

    //printTable er fundet på nettet dog ændret lidt
    public void printTabel(){

        for(int n = 0; n < 6*stackSize+1; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){

            System.out.format("| %2s "+ " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 6*stackSize+1; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){



            if(stackArray[n].equals("null")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", stackArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 6*stackSize+1; n++)System.out.print("-");

        System.out.println();

    }
}
