package tree.traversal;

import tree.bstImpl.BinarySearchTreeIterative;
import tree.bstImpl.Node;

public class InOrderTraversal {

    //prints tree in non decreasing order
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.getLeftChild());
        System.out.print(root.getData() + " ");
        inOrder(root.getRightChild());
    }

    public static void main(String[] args) {

        BinarySearchTreeIterative BST = new BinarySearchTreeIterative();

        BST.add(6);
        BST.add(4);
        BST.add(2);
        BST.add(5);
        BST.add(9);
        BST.add(8);
        BST.add(12);

        inOrder(BST.getRoot());

    }
}
