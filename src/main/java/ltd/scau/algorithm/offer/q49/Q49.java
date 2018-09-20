package ltd.scau.algorithm.offer.q49;

/**
 * @author Weijie Wu
 * <p>
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Q49 {

    public int GetUglyNumber_Solution(int index) {
        if (index < 1) {
            return 0;
        }
        int[] uglys = new int[index];
        uglys[0] = 1;
        int next = 1;

        int x2, x3, x5;
        x2 = x3 = x5 = 0;

        while (next < index) {
            int min = Integer.min(Integer.min(uglys[x2] * 2, uglys[x3] * 3), uglys[x5] * 5);
            uglys[next] = min;

            while (uglys[x2] * 2 <= uglys[next]) {
                x2++;
            }
            while (uglys[x3] * 3 <= uglys[next]) {
                x3++;
            }
            while (uglys[x5] * 5 <= uglys[next]) {
                x5++;
            }
            next++;
        }

        return uglys[next - 1];
    }
}
