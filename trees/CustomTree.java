package trees;

public class CustomTree<T> {
    private Node<T> root = null;

    // CREATE BINARY TREE
    public void createBinaryTree(T data) {
        Node<T> node = new Node<T>(data);
        Node<T> secondNode = new Node<T>(data);
        Node<T> thirdNode = new Node<T>(data);
        Node<T> forthNode = new Node<T>(data);
        Node<T> fifthNode = new Node<T>(data);

        /* ASSIGNMENT OF NODES */
        root = node; // SERVES AS THE FIRST NODE
        node.left = secondNode;
        node.right = thirdNode; // second<---node--->third
        secondNode.left = forthNode;
        secondNode.right = fifthNode; // fifth<---second--->forth

    }

    // TRAVERSE THE TREE RECURSIVELY
    public void preOrder(Node<T> node) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private class Node<T> {
        private Node<T> left;
        private Node<T> right;
        private T data;

        // constructor
        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
