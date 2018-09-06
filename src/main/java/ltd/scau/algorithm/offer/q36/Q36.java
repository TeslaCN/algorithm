package ltd.scau.algorithm.offer.q36;

/**
 * @author Weijie Wu
 * <p>
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Q36 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        TreeNode root = process(pRootOfTree);
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private TreeNode process(TreeNode pRootOfTree) {
        if (pRootOfTree.left != null) {
            TreeNode node = Convert(pRootOfTree.left);
            while (node.right != null) {
                node = node.right;
            }
            node.right = pRootOfTree;
            pRootOfTree.left = node;
        }
        if (pRootOfTree.right != null) {
            TreeNode node = Convert(pRootOfTree.right);
            while (node.left != null) {
                node = node.left;
            }
            node.left = pRootOfTree;
            pRootOfTree.right = node;
        }

        return pRootOfTree;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = root.left = new TreeNode(6);
        left.right = new TreeNode(8);
        left.left = new TreeNode(4);
        TreeNode right = root.right = new TreeNode(14);
        right.left = new TreeNode(12);
        right.right = new TreeNode(16);

        Q36 q = new Q36();
        TreeNode convert = q.Convert(root);
        TreeNode head = convert;
        while (convert.left != null) {
            convert = convert.left;
        }
        while (convert != null) {
            System.out.print(convert.val + ", ");
            convert = convert.right;
        }
        System.out.println();
        convert = head;
        while (convert.right != null) {
            convert = convert.right;
        }
        while (convert != null) {
            System.out.print(convert.val + ", ");
            convert = convert.left;
        }
    }
}
