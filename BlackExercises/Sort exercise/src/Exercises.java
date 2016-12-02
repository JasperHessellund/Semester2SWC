import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jasperhessellund on 25/10/2016.
 */
public class Exercises <E extends Comparable<E>>{


    //Ex 23.1
    public void bubbleSort(E[] list) {


        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }

        }
        System.out.println(Arrays.toString(list));
    }
    public void bubbleSort (E[] list, Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }


    //Ex 23.2
    public void printMerge (E[] list) {
        System.out.println(Arrays.toString(mergeSort(list)));
    }

    public E[] mergeSort (E[] list) {

        if (list.length > 1) {
            E[] firstHalf = Arrays.copyOfRange(list, 0, list.length/2);
            mergeSort(firstHalf);

            E[] secondHalf = Arrays.copyOfRange(list, list.length/2, list.length);
            mergeSort(secondHalf);





            merge(firstHalf, secondHalf, list);


        }

        return list;


    }

    public E[] merge(E[] list1, E[] list2, E[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].compareTo(list2[current2]) <0)
                temp[current3++] = list1[current1++];
            else
                temp[current3++] =  list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];

        return list1;
    }




    //Ex 23.3
    public void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
        System.out.println(Arrays.toString(list));
    }
    private void quickSort(E[] list, Integer first, Integer last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    private int partition(E[] list, Integer first, Integer last) {
        /** Partition the array list[first..last] */
        E pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low].compareTo(pivot) <= 0)
                low++;

            // Search backward from right
            while (low <= high && list[high].compareTo(pivot) >0)
                high--;

            // Swap two elements in the list
            if (high > low) {
                E temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high].compareTo(pivot) >= 0)
            high--;

        // Swap pivot with list[high]
        if (pivot.compareTo(list[high])>0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    //Ex 23.4
    public void improvedQuickSort(E[] list) {

    }
}
