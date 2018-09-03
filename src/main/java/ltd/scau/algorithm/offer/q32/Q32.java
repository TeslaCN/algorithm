package ltd.scau.algorithm.offer.q32;

import java.util.ArrayList;

/**
 * @author Weijie Wu
 *
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Q32 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        for (int i = 0; i < nodes.size(); i++) {
            TreeNode node = nodes.get(i);
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }

        return results;
    }
}
