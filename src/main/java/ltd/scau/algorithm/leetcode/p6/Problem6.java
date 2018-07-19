package ltd.scau.algorithm.leetcode.p6;

/**
 * @author Weijie Wu
 * <p>
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 * <p>
 * 实现一个将字符串进行指定行数变换的函数:
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 3
 * 输出: "PAHNAPLSIIGYIR"
 * 示例 2:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 4
 * 输出: "PINALSIGYAHRPI"
 * 解释:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class Problem6 {

    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        char[] newChars = new char[c.length];
        int pos = 0;

        int step = Math.max(2 * numRows - 2, 1);
        for (int i = 0; i < numRows; i++) {

            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < c.length; j += step) {
                    newChars[pos++] = c[j];
                }
            }
            else if (numRows % 2 == 1 && i == numRows / 2) {
                for (int j = i; j < c.length; j += step / 2) {
                    newChars[pos++] = c[j];
                }
            } else {
                for (int j = i, k = 0; j < c.length; k++) {
                    newChars[pos++] = c[j];
                    if (k % 2 == 0) {
                        j += step - i * 2;
                    } else {
                        j += i * 2;
                    }
                }
            }
        }
        return String.copyValueOf(newChars);
    }

    public static void main(String[] args) {
        Problem6 p = new Problem6();
        p.convert("PAYPALISHIRING", 4);
    }
}
