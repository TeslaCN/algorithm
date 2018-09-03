package ltd.scau.algorithm.offer.q33;

import java.util.ArrayDeque;

/**
 * @author Weijie Wu
 * <p>
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Q33 {

    public static boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length < 1) {
            return false;
        } else if (sequence.length == 1) {
            return true;
        }

        final ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(sequence.length - 1);
        stack.push(0);

        while (!stack.isEmpty()) {
            final int left = stack.pop();
            final int right = stack.pop();

            if (right - left <= 1) {
                return true;
            }

            int value = sequence[right];

            int i = left;
            for (; i < right && sequence[i] < value; i++) {
            }
            if (i > left) {
                stack.push(i - 1);
                stack.push(left);
            }

            int mid = i;

            for (; i < right && sequence[i] > value; i++) {
            }

            if (i < right) {
                return false;
            }
            stack.push(i - 1);
            stack.push(mid);
        }

        return true;
    }

}
