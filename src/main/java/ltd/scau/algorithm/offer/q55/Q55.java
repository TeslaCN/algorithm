package ltd.scau.algorithm.offer.q55;

import java.util.ArrayDeque;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * @author Weijie Wu
 */
public class Q55 {

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        TreeNode node = root;
        int max = Integer.MIN_VALUE;
        int current = 1;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
                current += node == null ? 0 : 1;
            }
            max = current > max ? current : max;
            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;
                current -= node == null ? 1 : -1;
            }
        }
        return max;
    }
}
