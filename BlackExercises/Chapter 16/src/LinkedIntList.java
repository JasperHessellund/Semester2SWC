import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by jasperhessellund on 08-09-2016.
 */
// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList {

    public ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;

    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data==value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        try {
            if (index == 0) {
                front = new ListNode(value, front);
            } else {
                ListNode current = nodeAt(index - 1);
                current.next = new ListNode(value, current.next);
            }
        } catch (Exception e) {
            System.out.println("index is not in order");
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    public void newList() {
        front = null;

    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    //BLACK EXERCISES
    //Page 1027
    //Ex1

    public int set(int index, int value) {
        ListNode current = front;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                current.data = value;
            }
        }
        return value;
    }

    //Ex2
    public int max() {
        ListNode current = front;
        int max = Integer.MIN_VALUE;
        if (current == null) {
            throw new NoSuchElementException();
        }
        while (current != null) {
            if (max < current.data) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }
    //Ex3

    public boolean isSorted () {

        int size = size();
        int count = 0;
        int j = 0;

        for (int i = 0; i<size; i++) {

            if (get(i++) == get(i)) {
                count++;
            }

        }
        return count==size;
    }

    //Ex4


    public int lastIndexOf(int value) {


        int found = -1;
        int index = 0;
        //runs the lists size
        while (index < size()) {
            //if the get method finds a index that is equal to the given value
            if (get(index) == value) {
                //The found attribute will be equal to index
                found = index;

            }
            //goes to the next index in the list
            index++;
        }
        //returns lastindexof or -1 depending on the given value
        return found;
    }

    //Ex 5 *Done*
    public int countDuplicates() {
        ListNode current = front;
        int index = 0;
        int count = 0;
        while (current != null) {

            if (index==current.data) {
                count++;

            }
            while (index != current.data) {
                index++;
            }
            current = current.next;

        }

        return count;
    }

    //Ex 6 *Semi Done*
    public boolean hasTwoConsecutive() {
        try {


            ListNode current = front;
            int ci;
            int ci2;

            while (current != null) {
                ci = current.data;
                ci2 = current.next.data;

                if (1 + ci == ci2) {
                    return true;
                }

                current = current.next;


            }
        } catch (NullPointerException npe) {
            return false;
        }
        return false;

    }

    //Ex7 *Done*
    public void deleteBack() {
        ListNode current = front;
        int index = 0;
        if (current == null) {
            throw new NoSuchElementException();
        }
        while (index < size()) {
            index++;
        }
        remove(index - 1);
    }

    //Ex 8 *Done*
    public void switchPairs() {
        int size = size();
        int size2 = size();
        int last = get(size-1);

        if (size%2!=0) {

            deleteBack();
            size = size-1;
        }
        for(int i = 0; i < size; i+=2) {
            add(get(i+1));

            add(get(i));





        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }
        if (size2%2!=0) {
            add(last);
        }



    }

    //Ex 9 *Done*
    public void stutter() {

        int size = size();
        for(int i = 0; i < size; i++) {

            add(get(i));
            add(get(i));




        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }


    }

    //Ex 10 *Done*
    public void stretch (int num) {

        int size = size();
        for(int i = 0; i < size; i++) {
            for (int j = 1; j <= num; j++) {
                add(get(i));

            }


        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }

    }

    //Ex 11 *Done*
    public void compress () {
        int size = size();
        int size2 = size();
        int last = get(size-1);
        if (size%2!=0) {

            deleteBack();
            size = size-1;
        }
        for (int i = 0; i< size;i+=2) {

            int result = get(i)+get(i+1);
            add(result);

        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }

        if (size2%2!=0) {
            add(last);
        }
    }

    //Ex 12 *Done*
    public void split () {
        ListNode current = front;
        while(current!=null) {
            current = current.next;

        }



    }
        /*
        int size = size();
        for (int i = 0; i<size; i++) {
            if (get(i)<0){

            }
        }
        for (int j = 0; j <size; j++) {
            if (get(j)>=0) {
                add(get(j));

            }

        }
        for (int g = 0; g<size; g++) {
            remove(0);
        } */




    //Ex 13 *Semi done*
    public void transferFrom (LinkedIntList list) {

        int size = size();



        for (int i = 0; i <size; i++){
            list.add(get(i));

        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }


    }
    //Ex 14 *Done*
    public void removeAll (int num) {
        ListNode current = front;
        int size = size();
        int i = 0;
        while (i <size) {

            if (get(i)!=num) {
                add(current.data);
                current = current.next;
            }
            if (get(i)==num) {
                current = current.next;
            }



            i++;
        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }

    }
    //Ex 15 *Done?*
    public boolean notEquals (LinkedIntList list) {
        int size = size();
        int size2 = list.size();
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (list.get(i)==get(i)) {
                count++;
            }

        }
        return count == size && size == size2;
    }

    //Ex 16
    public void removeEvens() {



    }

    //Ex 17
    public void removeRange (int num1, int num2) {
        int size = size();
        if (num1<0||num2<0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i<size; i++) {
            if (num1==i) {
                i=num2+1;
            }
            add(get(i));

        }
        for (int g = 0; g<size; g++) {
            remove(0);
        }

    }



}







