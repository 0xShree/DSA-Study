import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTZigzag {
    public static List<List<Integer>> solution(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // Add root TreeNode

        boolean rightToLeft = false;
        while(!queue.isEmpty()){

            int queueSize = queue.size(); // Get Queue size
            LinkedList<Integer> llist = new LinkedList<>();

            for(int i = 0; i < queueSize; i++){

                TreeNode currentNode = queue.poll(); // Remove the head

                if(rightToLeft) llist.addFirst(currentNode.val); // Add value to 0th position of LinkedList
                else llist.addLast(currentNode.val); // Add value to last position of LinkedList

                if(currentNode.left != null) queue.offer(currentNode.left); // Add left node boolean flag = false;
                if(currentNode.right != null) queue.offer(currentNode.right); // Add right node of currentNode
            }

            result.add(llist);
            rightToLeft = !rightToLeft;
        }

        return result;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
