package array;

import java.text.DecimalFormat;

public class BasicArrays {
    public static void main(String[] args) {

        //1 2 3 4 10 11
        int[] arr = {1, 2, 3, 4, 10, 11};
        System.out.println(getSumOfArray(arr));

        //-4 3 -9 0 4 1
        int[] arr2 = {-4, 3, -9, 0, 4, 1};
        elementsFraction(arr2);
    }

    private static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int j: array) {
            sum+=j;
        }
        return sum;
    }

    private static void elementsFraction(int[] arr) {
        double positiveCount = 0.0;
        double negativeCount = 0.0;
        double zeroCount = 0.0;

        for (int i: arr) {
            if (i < 0) {
                negativeCount++;
            }else if (i == 0){
                zeroCount++;
            }else {
                positiveCount++;
            }
        }

        System.out.println(String.format("%.6f", positiveCount/arr.length));
        System.out.println(String.format("%.6f", negativeCount/arr.length));
        System.out.println(String.format("%.6f", zeroCount/arr.length));
    }
}
