package ltd.scau.algorithm.offer.q56;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 * 时间O(n)
 * 空间O(1)
 *
 * @author Weijie Wu
 */
public class Q56 {

    /**
     * num1,num2分别为长度为1的数组。传出参数
     * 将num1[0],num2[0]设置为返回结果
     *
     * @param array
     * @param num1  返回结果1
     * @param num2  返回结果2
     */
    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }

        int bit = 1;
        for (int i = result; ; i >>>= 1) {
            if (1 == (i & 1)) {
                break;
            }
            bit <<= 1;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] & bit) == bit) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }
}
