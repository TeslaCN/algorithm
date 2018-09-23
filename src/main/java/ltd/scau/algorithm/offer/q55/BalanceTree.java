package ltd.scau.algorithm.offer.q55;

import ltd.scau.algorithm.offer.q55.Q55;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * @author Weijie Wu
 */
public class BalanceTree {

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

    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalance(root, new AtomicInteger(0));
    }

    private static boolean isBalance(TreeNode node, AtomicInteger depth) {
        if (node == null) {
            depth.set(0);
            return true;
        }

        AtomicInteger left = new AtomicInteger(0);
        AtomicInteger right = new AtomicInteger(0);

        if (isBalance(node.left, left) && isBalance(node.right, right)) {
            int i = left.get() - right.get();
            if (Math.abs(i) <= 1) {
                depth.set(Integer.max(left.get(), right.get()) + 1);
                return true;
            }
        }
        return false;
    }
}
