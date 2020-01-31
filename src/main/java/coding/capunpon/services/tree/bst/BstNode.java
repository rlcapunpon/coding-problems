package coding.capunpon.services.tree.bst;

import coding.capunpon.services.tree.Node;

public class BstNode implements Node {
    private Node parent;
    private Node left;
    private Node right;
    private int value;

    public BstNode(int value) {
        this.value = value;
    }

    @Override
    public void setRight(Node node) {
        right = node;
    }

    @Override
    public void setLeft(Node node) {
        left = node;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int x) {
        value = x;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
    }
}
