package array;

public class Array {
    private int[] array;
    private int count = 0;

    public Array(int size) {
        array = new int[size];
    }

    /**
     *
     * @param num add this to the array
     */
    public void insert(int num) {
        if (count == array.length) {
            int[] arr = new int[array.length * 2];
            for (int j = 0; j < array.length; j++){
                arr[j] = array[j];
            }
            array = arr;
        }
        array[count] = num;
        count++;
    }

    /**
     *
     * @return The size of the array
     */
    public int getCount(){
        return count;
    }

    /**
     *
     * @param index remove the item at this index
     */
    public void removeAt(int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException();
        }
        array[index] = 0;
        for (int i = index; i < count; i++)
            array[i] = array[i+1];

        count--;
    }


    /**
     *
     * @param value the value passed in
     * @return the index of the value
     */
    public int indexOf(int value) {
        for (int i = 0; i < count; i++)
            if (value == array[i]){
                return i;
            }

        return -1;
    }

    /**
     *
     * @return the maximum item in the array
     */
    public int max() {
        int largestNum = array[0];
        for (int i = 1; i < count; i++){
            if (largestNum < array[i]){
                largestNum = array[i];
            }
        }

        return largestNum;
    }


    /**
     *
     * @param arr
     * @return the common items in the Array and arr
     */
    public Array intersect(int[] arr) {
        Array newArray = new Array(1);

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arr.length; j++){
                if (array[i] == arr[j]) {
                    newArray.insert(array[i]);
                }
            }
        }
        return newArray;
    }

    /**
     *
     * @return reverse the current array
     */
    public Array reverse() {
        Array arrayNew = new Array(count);
        for (int i = 0; i < count; i++){
            arrayNew.insert(array[count -1 - i]);
        }
        return arrayNew;
    }

    public void insertAt(int item, int index) {
        //[10, 3, 5, [] 25, 23, 42]
        if (index < 0) {
            throw new IllegalArgumentException();
        }

        int temp = array[index];
        array[index] = item;
        array[index+1] = temp;

        count++;
        for (int i = index; i < count; i++) {
            array[i] = array[i+1];
        }
    }

    public void print() {
        System.out.println("All Elements in the Array");
        for (var i = 0; i<count; i++)
            System.out.println(array[i]);

    }
}
