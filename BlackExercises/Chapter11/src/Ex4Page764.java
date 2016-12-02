import java.util.*;

/**
 * Created by jasperhessellund on 31/08/16.
 */
//Done
public class Ex4Page764 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        Collections.addAll(list1, 15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9);
        partition(list1, 5);

    }
    public static void partition (List<Integer> list1, int value) {

        Iterator<Integer> it1 = list1.iterator();
        LinkedList<Integer> finalList = new LinkedList<Integer>();

        int number = it1.next();

        while(it1.hasNext()) {

            if(number>=value) {

                finalList.addLast(number);

                }
                else {
                    finalList.addFirst(number);


                }


            number = it1.next();

                }
        System.out.println(finalList);


            }



        }



