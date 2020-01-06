package sorting;

//O(n2)
public class InsertionSort {

    //[3, 7, 3, 5, 1, 9, 2]
    // 0, 1, 2, 3, 4, 5, 6

    //first iteration
    //current = 7, i = 1, j = 0

    //second iteration
    //current = 3, i = 2, j = 1

    //3rd iteration
    //current = 2, i = 3, j = 2


    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > current) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
