package hackerank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 7, 8};
        int d = 0;

        leftRotate(arr, d);
    }


    private static void leftRotate(int[] a, int d) {
        Queue<Integer> queue = new ArrayDeque<>();

        if (d != 0) {

            if (d > a.length) {
                d = d % a.length;
            }

            if (d < 0) {
                d = Math.abs(d);
            }

            for (int i = 0; i < d; i++) {
                queue.add(a[i]);
                a[i] = 0;
            }

            for (int j = d; j < a.length; j++) {
                a[j-d] = a[j];
                a[j] = 0;
            }

            int z = a.length - d;

            while (!queue.isEmpty()) {
                a[z] = queue.remove();
                z++;
            }


            int i = 0;
            StringBuilder builder = new StringBuilder();
            while (i < a.length){
                builder.append(a[i]+" ");
                i++;
            }
            System.out.println(builder.toString());


        }else  {
            int i = 0;
            StringBuilder builder = new StringBuilder();
            while (i < a.length){
                builder.append(a[i]+" ");
                i++;
            }
            System.out.println(builder.toString());
        }

    }
}
