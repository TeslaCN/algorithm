package ltd.scau.algorithm.offer.q38;

import java.util.ArrayList;

/**
 * @author Weijie Wu
 *
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Q38 {


    public ArrayList<String> permutation(String str) {
        if (str == null || str.length() < 1) {
            return results;
        }
        permutation(str.toCharArray(), 0);

        return results;
    }

    private ArrayList<String> results = new ArrayList<>();

    private static void swap(char[] chars, int a, int b) {
        char forSwap = chars[a];
        chars[a] = chars[b];
        chars[b] = forSwap;
    }

    private void permutation(char[] chars, int p) {
        if (chars == null) {
            return;
        }
        if (p == chars.length - 1) {
            results.add(new String(chars));
        } else {
            for (int i = p; i < chars.length; i++) {
                if (i != p && chars[i] == chars[p]) {
                    continue;
                }
                swap(chars, i, p);
                permutation(chars, p + 1);
                swap(chars, i, p);
            }
        }

    }

    public static void main(String[] args) {
        Q38 q = new Q38();
        ArrayList<String> list = q.permutation("aba");
        System.out.println(list);
    }
}
