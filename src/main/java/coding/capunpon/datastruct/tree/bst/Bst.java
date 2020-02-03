package coding.capunpon.datastruct.tree.bst;

import coding.capunpon.datastruct.tree.Node;

public class Bst {
    private Node head;

    public Bst(Node node) {
        head = node;
    }

    public Bst(int val) {
        head = new BstNode(val);
    }

    public Bst() {
    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            appendNode(head, node);
        }
    }

    private void appendNode(Node branch, Node leaf) {
        if (branch.getValue() > leaf.getValue()) {
            if(branch.getLeft() != null) {
                appendNode(branch.getLeft(), leaf);
            } else {
                System.out.println(leaf.getValue() + " set on Left side of " + branch.getValue());
                leaf.setParent(branch);
                branch.setLeft(leaf);

            }
        } else {
            if( branch.getRight() != null) {
                appendNode(branch.getRight(), leaf);
            } else {
                System.out.println(leaf.getValue() + " set on Right side of " + branch.getValue() );
                leaf.setParent(branch);
                branch.setRight(leaf);
            }
        }
    }

    public void printLeafNodes(Node node) {
         if (node == null) { return; }
         if (node.getLeft() == null && node.getRight() == null) {
             System.out.printf("%d ", node.getValue());
         }
         printLeafNodes(node.getLeft());
         printLeafNodes(node.getRight());
    }

    public void printAscending(Node node) {
            if(node.getLeft() != null) {
                printAscending(node.getLeft());
            }
            System.out.print(node.getValue() + " ");
            if(node.getRight() != null) {
                printAscending(node.getRight());
            }
    }

    public Node getHead() {
        return head;
    }
}
