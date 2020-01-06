package recursion;

public class Recusion1 {

    public static void main(String[] args) {
        //System.out.println(fab(4));
       // System.out.println(0.2 + 0.2 == 0.4);
    }


    //factorial 3! = 3 x 2 x 1
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    //fabonnaci nums => 0, 1, 1, 2, 3, 5, 8.......
    private static int fab(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fab(n-1) + fab(n-2);
    }

}
