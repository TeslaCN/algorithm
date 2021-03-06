package ltd.scau.algorithm.offer.q7;

import java.util.Arrays;

/**
 * @author Weijie Wu
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Q7 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {

            return "" + val +
                    (left != null ? "" + left : "") +
                    (right != null ? "" + right : "");
        }
    }


    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length < 1) {
            return null;
        }
        int root = pre[0];
        TreeNode node = new TreeNode(root);
        if (pre.length == 1) {
            return node;
        }
        int index = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == root) {
                index = i;
            }
        }
        node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index + 1), Arrays.copyOfRange(in, 0, index));
        node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, index + 1, pre.length), Arrays.copyOfRange(in, index, in.length));
        return node;
    }

    public static void main(String[] args) {
        Q7 q = new Q7();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println(q.reConstructBinaryTree(pre, in));

        pre = new int[]{1, 2, 3, 4, 5, 6, 7};
        in = new int[]{3, 2, 4, 1, 6, 5, 7};
        System.out.println(q.reConstructBinaryTree(pre, in));
    }
}
