// Class for storing a single node of a binary tree of ints

public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getLeft() {
        return left.data;
    }

    public void setLeft(IntTreeNode left) {
        this.left = left;
    }

    public IntTreeNode getRight() {
        return right;
    }

    public void setRight(IntTreeNode right) {
        this.right = right;
    }

    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }

    // constructs a branch node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left,
                       IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
