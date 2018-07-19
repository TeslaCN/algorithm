package ltd.scau.algorithm.leetcode.p5;

import java.util.Arrays;

/**
 * @author Weijie Wu
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Problem5 {

    public static boolean isReversable(char[] c, int start, int length) {
        for (int i = start, j = length; i < j; i++, j--) {
            if (c[i] != c[j]) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public String longestPalindromeEnumeration(String s) {
        if (s.equals("")) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int start = 0, end = chars.length - i - 1; end < chars.length; start++, end++) {
                if (isReversable(chars, start, end)) {
                    return String.copyValueOf(chars, start, end - start + 1);
                }
            }
        }
        return String.valueOf(chars[0]);
    }

    public String longestPalindrome(String s) {
        String str = "#" + String.join("#", s.split("")) + "#";
        char[] chars = str.toCharArray();

        int[] rl = new int[chars.length];
        int maxRight = 0, pos = 0, maxPos = 0;

        for (int i = 0; i < chars.length; i++) {

            if (i < maxRight) {
                rl[i] = Math.min(rl[pos * 2 - i], maxRight - i);
            } else {
                rl[i] = 1;
            }

            while (i - rl[i] >= 0 && i + rl[i] < chars.length && chars[i - rl[i]] == chars[i + rl[i]]) {
                rl[i]++;
            }

            if (i + rl[i] - 1 > maxRight) {
                maxRight = i + rl[i] - 1;
                pos = i;
            }
            if (rl[i] > rl[maxPos]) {
                maxPos = i;
            }
        }

        return str.substring(maxPos + 1 - rl[maxPos], maxPos + rl[maxPos]).replaceAll("#", "");
    }

    public static void main(String[] args) {
        Problem5 p = new Problem5();
        p.longestPalindrome("ababc");
    }
}
