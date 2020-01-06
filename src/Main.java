import sorting.BubbleSort;
import sorting.SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var bubbleSort = new BubbleSort();
        int[] intArray = generateRandomArray();
        bubbleSort.sort(intArray);
        System.out.println("------------ Bubble Sort ------------");
        System.out.println(Arrays.toString(intArray));
        System.out.println("-------------------------------------");

        var selectionSort = new SelectionSort();
        int[] intArray2 = generateRandomArray();
        selectionSort.sort(intArray2);
        System.out.println("------------ Selection Sort -----------");
        System.out.println(Arrays.toString(intArray2));
        System.out.println("---------------------------------------");
    }


    private static int[] generateRandomArray() {
        Random r = new Random();
        int [] array = new int[10];
        for (int a = 0; a < array.length; a++) {
            if ((a + 1) % 10 != 0) {
                array[a] = (a + 1) * 10;
            } else {
                array[a] = r.nextInt(10000);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = r.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
        return array;
    }
}
