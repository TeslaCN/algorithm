package ltd.scau.algorithm.leetcode.p3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Weijie Wu
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * <p>
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */
public class Solution {

    @Deprecated
    public int lengthOfLongestSubstringEnumeration(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (result > chars.length - i) {
                break;
            }
            for (int j = i; j < chars.length; j++) {
                if (!set.contains(chars[j])) {
                    set.add(chars[j]);
                    if (set.size() > result) {
                        result = set.size();
                    }
                } else {
                    set.clear();
                    break;
                }
            }
        }
        return result;
    }

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int start = 0, end = 0; end < chars.length; ) {
            while (end < chars.length && !set.contains(chars[end])) {
                set.add(chars[end++]);
            }
            if (set.size() > result) {
                result = set.size();
            }
            set.remove(chars[start++]);
        }

        return result;
    }

}
