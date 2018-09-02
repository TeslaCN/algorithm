package ltd.scau.algorithm.offer.q5;

/**
 * @author Weijie Wu
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Q5 {

    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() < 1) {
            return "";
        }
        int spaceCount = 0;
        char[] source = str.toString().toCharArray();
        for (char c : source) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        final char[] c = new char[]{'%', '2', '0'};
        char[] dest = new char[source.length + spaceCount * 2];
        for (int i = source.length - 1, target = dest.length - 1; i >= 0; i--) {
            if (source[i] == ' ') {
                for (int j = 2; j >= 0; j--) {
                    dest[target--] = c[j];
                }
            } else {
                dest[target--] = source[i];
            }
        }
        return new String(dest);
    }

    public static void main(String[] args) {
        Q5 q = new Q5();
        System.out.println(q.replaceSpace(new StringBuffer("We Are Happy.")));
    }
}
