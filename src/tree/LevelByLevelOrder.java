package tree;

import tree.bstImpl.BinarySearchTreeIterative;
import tree.bstImpl.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelByLevelOrder {

    public static void levelBylevelOrder(Node root){
        int levelCount = 1;
        int currentCount = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
          while(levelCount > 0) {
              root = queue.poll();
              System.out.print(root.getData() + " ");

              if (root.getLeftChild() != null) {
                  queue.add(root.getLeftChild());
                  currentCount++;
              }
              if (root.getRightChild() != null) {
                  queue.add(root.getRightChild());
                  currentCount++;
              }
              levelCount--;
          }
             System.out.println();
              levelCount = currentCount;
              currentCount = 0;

        }

    }


    public static void main(String[] args) {

        BinarySearchTreeIterative bt = new BinarySearchTreeIterative();
         bt.add(10);
         bt.add(20);
         bt.add(30);
         bt.add(15);
         bt.add(-10);
         bt.add(0);
         bt.add(5);
         bt.add(-5);
         bt.add(-15);
         bt.add(27);
         bt.add(35);

        levelBylevelOrder(bt.getRoot());
    }
}


//    List<List<Integer>> res = new ArrayList<>();
//if (root == null) return res;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//        　　List<Integer> level = new ArrayList<>();
//        　　int cnt = queue.size();
//        　　for (int i = 0; i < cnt; i++) {
//        　　　　TreeNode node = queue.poll();
//        　　　　level.add(node.val);
//        　　　　if (node.left != null) {
//        　　　　　　queue.add(node.left);
//        　　　　}
//        　　　　if (node.right != null) {
//        　　　　　　queue.add(node.right);
//        　　　　}
//        　　}
//        　　res.add(level);
//        }
//        return res;