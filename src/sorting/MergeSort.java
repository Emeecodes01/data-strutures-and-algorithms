package sorting;

public class MergeSort {

    public void sort(int[] array) {
        //Break the array into left and right
        if (array.length == 1)
            return;

        int middle = array.length/2;
        int[] left = new int[middle];

        for (int i = 0; i < middle; i++)
            left[i] = array[i];

        int[] right = new int[array.length-middle];

        for (int j = middle; j < array.length; j++)
            right[j-middle] = array[j];

        sort(left);
        sort(right);

        merge(left, right, array);
    }


    private void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }

        while (i < left.length)
            array[k++] = left[i++];

        while (j < right.length)
            array[k++] = right[j++];
    }

}
