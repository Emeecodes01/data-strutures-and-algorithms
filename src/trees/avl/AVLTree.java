package trees.avl;

public class AVLTree {
    private AVLNode root;


    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode node, int value) {
        var avlNode = new AVLNode(value);
        if (node == null)
            return avlNode;

        if (value < node.value)
            node.leftChild = insert(node.leftChild, value);
        else
            node.rightChild = insert(node.rightChild, value);


        node.height = Math.max(
                height(node.leftChild),
                height(node.rightChild)) + 1;

        //balance factor = h(L) - h(R)
        //BF > 1 //LEFT HEAVY
        //BF < -1 // RIGHT HEAVY


        if (isLeftHeavy(node))
            System.out.println(node.value + "LEFT HEAVY");
        else if (isRightHeavy(node))
            System.out.println(node.value + "RIGHT HEAVY");

        return node;
    }

    private int balanceFactor(AVLNode node) {
        return node == null ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }


    private int height(AVLNode node) {
        return node == null ? -1 : node.height;
    }


    class AVLNode {
        private int value;
        private int height = 0;
        private AVLNode leftChild;
        private AVLNode rightChild;


        public AVLNode(int value) {
            this.value = value;
        }
    }


}
