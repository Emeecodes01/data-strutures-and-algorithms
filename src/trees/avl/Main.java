package trees.avl;

public class Main {

    public static void main(String[] args) {
        //int[] arr = {7, 4, 1, 6, 9, 8, 10};
        int[] arr = {30, 20, 10};
        //int[] arr = {3, 16, 4, 12, 19, 8, 2, 1};
        AVLTree avlTree = new AVLTree();

        for (int i: arr) {
            avlTree.insert(i);
        }

        System.out.println(avlTree);
    }
}
