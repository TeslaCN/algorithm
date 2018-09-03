package ltd.scau.algorithm.offer.q31;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @author Weijie Wu
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class Q31 {

    public static boolean isPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || pushA.length < 1 || popA == null || popA.length < 1 || pushA.length < popA.length) {
            return false;
        }

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int match = 0;
        int current = 0;

        while (current < pushA.length || stack.size() > 0) {

            if (current < pushA.length) {
                stack.push(pushA[current++]);
            }

            if (stack.peek().equals(popA[match])) {
                stack.pop();
                match++;
            } else if (current == pushA.length) {
                return false;
            }
        }

        return match == popA.length;
    }
}
