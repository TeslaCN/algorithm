package ltd.scau.algorithm.offer.q55;

import ltd.scau.algorithm.offer.q55.Q55;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Weijie Wu
 */
class Q55Test {

    @Test
    void test() {
        Q55.TreeNode root = new Q55.TreeNode(1);
        root.left = new Q55.TreeNode(2);
        root.right = new Q55.TreeNode(3);
        root.left.left = new Q55.TreeNode(4);
        root.left.right = new Q55.TreeNode(5);

        root.right.right = new Q55.TreeNode(6);
        root.left.right.left = new Q55.TreeNode(7);

        int depth = Q55.TreeDepth(root);
        Assertions.assertEquals(4, depth);
    }

}