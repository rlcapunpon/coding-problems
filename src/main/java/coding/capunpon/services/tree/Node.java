package coding.capunpon.services.tree;

public interface Node {
    void setRight(Node node);
    void setLeft(Node node);
    Node getRight();
    Node getLeft();
    int getValue();
    void setValue(int x);
    Node getParent();
    void setParent(Node parent);
}
