package sorting;


//O(n2)
public class BubbleSort {

    public void sort(int[] array) {
        boolean isSorted;


        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j-1]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }

            if (isSorted)
                return;
        }
    }
}
