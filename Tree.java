class Tree {
    // Starting point of the tree
    Node root;

    // Node structure
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
            left = right = null;
        }
    }

    // Keeping root as null
    Tree() {
        root = null;
    }

    // Initialize first node
    Tree(int value) {
        root = new Node(value);
    }

    // Insert method
    Node insert(Node root, int value) {
        // Tree is empty, create new node
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value <= root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Deletion method
    Node deletion(Node root, int value) {
        if (root == null) {
            return root;
        }
        if (value < root.data) {
            root.left = deletion(root.left, value);
        } else if (value > root.data) {
            root.right = deletion(root.right, value);
        } else {
            // Node with one or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children
            root.data = minValue(root.right);
            root.right = deletion(root.right, root.data);
        }
        return root;
    }

    // Helper method to find the minimum value in a tree
    int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }
}
