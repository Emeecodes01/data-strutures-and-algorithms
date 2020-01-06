package trees.bst;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private Node root;
    private int size;

    private class Node {
        int value;

        public Node(int value) {
            this.value = value;
        }

        Node leftChild;
        Node rightChild;
    }

    @Override
    public String toString() {
        return "NODE = "+root.value;
    }


    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
            size++;
            return;
        }

        var current = root;
        while (true) {
            if (val < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(val);
                    size++;
                    break;
                }
                current = current.leftChild;
            }else {
                if (current.rightChild == null){
                    current.rightChild = new Node(val);
                    size++;
                    break;
                }
                current = current.rightChild;
            }
        }
    }


    public boolean find(int value) {
        if (root == null) {
            throw new IllegalStateException("This tree is empty");
        }

        if (root.value == value){
            return true;
        }

        var current = root;
        while (current != null) {

            if (value == current.value) {
                return true;
            }else if (value < current.value) {
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }
        }
        return false;
    }

    public int height() {
        return height(root);
    }


    private int height(Node node) {
        if (node == null) {
            return -1;
        }

        if (isLeaf(node)) {
            return 0;
        }
        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null || node.rightChild == null;
    }


    //todo: implement this
    private List<Integer> getAncestors(Node node, int n) {
        List<Integer> integerList = new ArrayList<>();
        var current = node;

        if (contains(n)) {
            throw new IllegalArgumentException("Value doesn't exist");
        }

        while (current != null) {
            if (current.value == n) {

                current = null;
            }
        }

        return integerList;
    }


    //todo: solve this
    public boolean isBalanced() {
        int balanceFactor = height(root.rightChild) - height(root.leftChild);
        return  balanceFactor <= 1;
    }


    private boolean isBalanced(Node node) {

        return true;
    }

    public int min() {
        return min(root);
    }

    private int min(Node root){
        if (isLeaf(root)) {
            return root.value;
        }

        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }


    public int max() {
        return max(root);
    }

    public boolean contains(int num) {
        return contains(root, num);
    }


    private boolean contains(Node node, int num) {
        boolean containsValue = false;

        if (node == null)
            return false;

        if (node.value == num) {
            containsValue = true;
        }

        if (contains(node.leftChild, num) || contains(node.rightChild, num)) {
            containsValue = true;
        }

        return containsValue;
    }

    public boolean areSiblings(int n1, int n2) {
        return areSiblings(root, n1, n2);
    }

    private boolean areSiblings(Node node, int n1, int n2) {
        boolean areSiblings = false;

        if (isLeaf(node))
            return false;

        if ((node.rightChild.value == n1 && node.leftChild.value == n2) ||
                (node.leftChild.value == n1 && node.rightChild.value == n2)) {
            areSiblings = true;
        }

        if (areSiblings(node.rightChild, n1, n2) || areSiblings(node.leftChild, n1, n2)) {
            areSiblings = true;
        }

        return areSiblings;
    }



    private int max(Node root) {
        if (isLeaf(root)) {
            return root.value;
        }

        int leftMax = max(root.leftChild);
        int rightMax = max(root.rightChild);

        int leftRightMax = Math.max(leftMax, rightMax);
        return Math.max(leftRightMax, rightMax);
    }

    public int size() {
        return size;
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node node) {
        int leaveCount = 0;

        if (isLeaf(node)){
            return 1;
        }

        return countLeaves(node.leftChild) + countLeaves(node.rightChild);
    }


    public void printNodeAtKthDistance(int distance) {
        printNodeAtKthDistance(root, distance);
    }


    private void printNodeAtKthDistance(Node node, int distance) {
        if (node == null){
            return;
        }
        if (distance == 0) {
            System.out.println(node.value);
            return;
        }

        printNodeAtKthDistance(node.leftChild, distance -1);
        printNodeAtKthDistance(node.rightChild, distance -1);
    }


    public boolean isEqual(Tree tree) {
        return isEqual(root, tree.root);
    }

    private boolean isEqual(Node root, Node tree) {
        if (root == null && tree == null)
            return true;

        if (root != null && tree != null) {
            return  root.value == tree.value
                    && isEqual(root.leftChild, tree.leftChild)
                    && isEqual(root.rightChild, tree.rightChild);
        }

        return false;
    }


    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traverseInOrder(Node node) {
        //In-order: left -> root -> right
        if (node == null)
            return;

        traverseInOrder(node.leftChild);
        System.out.println(node.value);
        traverseInOrder(node.rightChild);
    }


    private void traversePreOrder(Node root) {
        //Pre-order: root -> left -> right
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }


    private void traversePostOrder(Node node) {
        //In-order: root -> left -> right
        if (node == null)
            return;

        traverseInOrder(node.leftChild);
        traverseInOrder(node.rightChild);
        System.out.println(node.value);
    }
}
