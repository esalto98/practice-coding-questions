import java.util.*;

class Solution {
     // Definition for a binary tree node.
      public class TreeNode {
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
     


    List<Integer> collect;
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> leaves = new ArrayList<List<Integer>>();

        while (!isLeaf(root)) {
            collect = new ArrayList<Integer>();
            removeLeaves(root);
            leaves.add(collect);

        }
        leaves.add(Arrays.asList(root.val));

        return leaves;
    }

    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public TreeNode removeLeaves(TreeNode root) {
        if (root == null)
            return null;

        boolean wasLeaf = isLeaf(root);

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);

        if (isLeaf(root) && wasLeaf) {
            collect.add(root.val);
            return null;
        }

        return root;
    }
}