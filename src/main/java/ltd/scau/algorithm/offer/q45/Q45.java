package ltd.scau.algorithm.offer.q45;

import java.util.Arrays;

/**
 * @author Weijie Wu
 * <p>
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Q45 {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return "";
        }

        String[] n = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            n[i] = numbers[i] + "";
        }

        Arrays.sort(n, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length; i++) {
            sb.append(n[i]);
        }
        return sb.toString();
    }

}
