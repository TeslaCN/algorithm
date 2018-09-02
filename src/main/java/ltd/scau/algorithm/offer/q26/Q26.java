package ltd.scau.algorithm.offer.q26;

/**
 * @author Weijie Wu
 * <p>
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Q26 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        boolean result = false;

        if (root1.val == root2.val) {
            result = isSub(root1, root2);
        }
        if (!result) {
            result = isSub(root1.left, root2);
        }
        if (!result) {
            result = isSub(root1.right, root2);
        }

        return result;
    }

    private static boolean isSub(TreeNode n1, TreeNode n2) {
        return n2 == null ? true : n1 == null ? false : n1.val != n2.val ? false : isSub(n1.left, n2.left) && isSub(n1.right, n2.right);
    }


    public static void main(String[] args) {

    }
}
