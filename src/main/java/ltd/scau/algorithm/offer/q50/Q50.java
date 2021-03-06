package ltd.scau.algorithm.offer.q50;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 *
 * @author Weijie Wu
 */
public class Q50 {

    public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
