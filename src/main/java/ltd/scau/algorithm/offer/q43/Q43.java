package ltd.scau.algorithm.offer.q43;

import java.util.Arrays;

/**
 * @author Weijie Wu
 * <p>
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class Q43 {

    public int oneInRange(int n) {
        if (n < 0) {
            return 0;
        }
        char[] num = ("" + n).toCharArray();
        int result = count1(num, 0, num.length);
        return result;
    }

    private static int count1(char[] num, int start, int end) {

        if (start >= end) {
            return 0;
        }

        int first = num[start] - '0';
        int length = end - start;

        if (length == 1 && first > 0) {
            return 1;
        }
        if (length == 1 && first == 0) {
            return 0;
        }

        int numFirstDigit = 0;
        if (first > 1) {
            numFirstDigit = powBase10(length - 1);
        } else if (first == 1) {
            numFirstDigit = Integer.valueOf(new String(Arrays.copyOfRange(num, start + 1, end))) + 1;
        }

        int numOtherDigits = first * (length - 1) * powBase10(length - 2);
        int numRecursive = count1(num, start + 1, end);

        return numFirstDigit + numOtherDigits + numRecursive;
    }

    private static int powBase10(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            num *= 10;
        }
        return num;
    }

}
