package trees.bst;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {7, 4, 1, 6, 9, 8, 10};
        //int[] arr = {3, 16, 4, 12, 19, 8, 2, 1};
        int[] arr = {30, 20, 10};
        Tree tree = new Tree();
        Tree tree2 = new Tree();
        for (int i: arr) {
            tree.insert(i);
            tree2.insert(i);
        }

//        tree2.insert(4);
//
//        boolean v = tree.find(11);
//        System.out.println(v);
//
//        System.out.println("----------Traverse pre order----------");
//        tree.traversePreOrder();
//
//
//        System.out.println("----------Traverse in order----------");
//        tree.traverseInOrder();
//
//
//        System.out.println("----------Traverse Post order----------");
//        tree.traversePostOrder();
//
//
//        System.out.println("-----------Height of tree -------------");
//        System.out.println(tree.height());
//
//
//        System.out.println("-------- Min value of tree ---------");
//        System.out.println(tree.min());
//
//        System.out.println("-------- Max value of tree ---------");
//        System.out.println(tree.max());
//
//
//        System.out.println("--------- IS EQUAL -------------");
//        System.out.println(tree.isEqual(tree2));
//
//
//        System.out.println("----------ALL VALUES AT Kth DISTANCE -----------");
//        tree.printNodeAtKthDistance(2);
//
//        System.out.println("----------SIZE OF TREE -------------");
//        System.out.println(tree.size());
//
//        System.out.println("---------- LEAVE COUNT ---------");
//        System.out.println(tree.countLeaves());
//
//        System.out.println("--------- CONTAINS ----------");
//        System.out.println(tree.contains(40));
//
//
//        System.out.println("-------- ARE SIBLINGS --------");
//        System.out.println(tree.areSiblings(8, 6));

        System.out.println("---------IS BALANCED ---------");
        System.out.println(tree.isBalanced());

    }

}
