package ltd.scau.algorithm.offer.q34;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Weijie Wu
 * <p>
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Q34 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "\n" + (left != null ? "left: " + left : "") + (right != null ? "right: " + right : "");
        }
    }

    private int sum = 0;
    private ArrayDeque<Integer> path = new ArrayDeque<>();
    private ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return paths;
        }

        path.push(root.val);
        sum += root.val;

        if (root.left == null && root.right == null && sum == target) {
            ArrayList<Integer> p = new ArrayList<>(Arrays.asList(path.toArray(new Integer[0])));
            Collections.reverse(p);
            paths.add(p);
        }
        if (root.left != null) {
            FindPath(root.left, target);
        }
        if (root.right != null) {
            FindPath(root.right, target);
        }

        path.pop();
        sum -= root.val;

        return paths;
    }


    public static void main(String[] args) {
        TreeNode root;
        root = new Q34.TreeNode(10);
        root.right = new Q34.TreeNode(12);
        root.left = new Q34.TreeNode(5);
        root.left.left = new Q34.TreeNode(9);
        root.left.right = new Q34.TreeNode(7);
        Q34 q = new Q34();
        System.out.println(q.FindPath(root, 22));
        System.out.println();
    }

}
