package coding.capunpon.services.tree;

import coding.capunpon.services.tree.bst.Bst;
import coding.capunpon.services.tree.bst.BstNode;

public class Trees {
    public static void main(String args[]) {
        Bst bst = new Bst();
        bst.addNode(new BstNode(4));
        bst.addNode(new BstNode(3));
        bst.addNode(new BstNode(8));
        bst.addNode(new BstNode(1));
        bst.addNode(new BstNode(5));
        bst.addNode(new BstNode(6));
        bst.addNode(new BstNode(9));

//        bst.printLeafNodes(bst.getHead());
        bst.printAscending(bst.getHead());
    }
}
