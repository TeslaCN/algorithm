package ltd.scau.algorithm.offer.q42;

/**
 * @author Weijie Wu
 * <p>
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Q42 {

    public int FindGratestSumOfSubArray(int[] array) {
        if (array == null) {
            return 0;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (sum < 0) {
                sum = array[i];
            } else {
                sum += array[i];
            }
            max = sum > max ? sum : max;
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] num = {6, -3, -2, 7, -15, 1, 2, 2};
//        int[] num = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] num = {-2, -8, -1, -5, -9};
        Q42 q = new Q42();
        System.out.println(q.FindGratestSumOfSubArray(num));
    }
}
