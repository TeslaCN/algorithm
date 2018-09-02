package ltd.scau.algorithm.offer.q15;

/**
 * @author Weijie Wu
 * <p>
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Q15 {

    public static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(-1));
        System.out.println(numberOf1(1));
        System.out.println(numberOf1(7));
        System.out.println(numberOf1(8));
        System.out.println(numberOf1(Integer.MAX_VALUE));
        System.out.println(numberOf1(Integer.MIN_VALUE));
    }
}
