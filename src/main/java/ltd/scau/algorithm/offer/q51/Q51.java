package ltd.scau.algorithm.offer.q51;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 输入描述:
 * 题目保证输入的数组中没有的相同的数字
 * 数据范围：
 * 对于%50的数据,size<=10^4
 * 对于%75的数据,size<=10^5
 * 对于%100的数据,size<=2*10^5
 * <p>
 * 1,2,3,4,5,6,7,0
 * 7
 *
 * @author Weijie Wu
 */
public class Q51 {

    public static int inversePairs(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int[] temp = new int[array.length];

        int result = mergeSortWithInverseCount(array, 0, array.length, temp);

        return result;
    }

    private static int mergeSortWithInverseCount(int[] a, int left, int right, int[] temp) {
        int mid = (left + right) >>> 1;
        int count = 0;
        if (right - left > 1) {
            count += mergeSortWithInverseCount(a, left, mid, temp) + mergeSortWithInverseCount(a, mid, right, temp);
        }
        return count + merge(a, left, mid, right, temp);
    }

    private static int merge(int[] a, final int left, final int mid, final int right, int[] temp) {
        int nextIndex = right - 1;
        int l = mid - 1, r = right - 1;
        int count = 0;
        while (l >= left && r >= mid) {
            if (a[l] > a[r]) {
                count += r - mid + 1;
                temp[nextIndex--] = a[l--];
            } else {
                temp[nextIndex--] = a[r--];
            }
        }
        while (r >= mid) {
//            count += mid - left > 0 ? r - mid + 1 : 0;
            temp[nextIndex--] = a[r--];
        }
        while (l >= left) {
            temp[nextIndex--] = a[l--];
        }
        for (int i = left; i < right; i++) {
            a[i] = temp[i];
        }
        return count;
    }
}
