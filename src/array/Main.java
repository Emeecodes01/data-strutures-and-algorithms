package array;

public class Main {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(30);
        array.insert(50);
        array.insert(60);
        array.insert(5);
        array.insert(15);

        int[] arr = {45, 78, 34, 10, 234, 43, 45};

        array.print();

        System.out.println("Largest item in array: "+array.max());
        System.out.println("Intersect: \n");
        array.intersect(arr).print();
        System.out.println("Reversed array");
        array.reverse().print();
        array.insertAt(20, 2);
        System.out.println("InsertAt \n");
        array.print();
    }
}
