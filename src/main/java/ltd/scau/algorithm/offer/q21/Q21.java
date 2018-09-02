package ltd.scau.algorithm.offer.q21;

import java.util.Arrays;

/**
 * @author Weijie Wu
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Q21 {

    public static void reOrderArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int target = array[i];
            if ((target & 1) == 0) {
                continue;
            }
            int j;
            for (j = i; j > 0 && (array[j - 1] & 1) != 1; j--) {
                array[j] = array[j - 1];
            }
            array[j] = target;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reOrderArray(a);
        System.out.println(Arrays.toString(a));
    }
}
