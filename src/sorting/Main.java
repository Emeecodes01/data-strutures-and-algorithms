package sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 5, 8, 7, 4, 6, 24, 13, 80};
        int[] array2 = {2, 5, 8, 7, 4, 6, 24, 13, 80};
        int[] array3 = {2, 5, 8, 7, 4, 6, 24, 13, 80};
        int[] array4 = {2, 5, 8, 7, 4, 6, 24, 13, 80};

        BubbleSort sort = new BubbleSort();
        SelectionSort sort1 = new SelectionSort();
        InsertionSort sort2 = new InsertionSort();
        MergeSort sort3 = new MergeSort();


        sort.sort(array);
        sort1.sort(array2);
        sort2.sort(array3);
        sort3.sort(array4);

        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(array));

        System.out.println("Selection sort");
        System.out.println(Arrays.toString(array2));

        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(array3));

        System.out.println("Merge sort");
        System.out.println(Arrays.toString(array4));

    }
}
