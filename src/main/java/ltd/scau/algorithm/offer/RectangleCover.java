package ltd.scau.algorithm.offer;

/**
 * @author Weijie Wu
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectangleCover {

    public static int cover(int target) {
        if (target < 1) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        int[] a = new int[target];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[target - 1];
    }

    public static void main(String[] args) {
        System.out.println(cover(3));
        System.out.println(cover(10));
    }
}
