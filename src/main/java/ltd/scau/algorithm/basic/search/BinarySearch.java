package ltd.scau.algorithm.basic.search;

/**
 * @author Weijie Wu
 */
public class BinarySearch {

    public static int search(int[] a, int left, int right, int target) {
        if (a == null || a.length < 1 || left == right) {
            return -1;
        }
        if (left == right - 1) {
            if (target == a[left]) {
                return left;
            } else {
                return -1;
            }
        }
        int mid = (left + right) / 2;
        int midValue = a[mid];
        if (target == midValue) {
            return mid;
        } else if (target < midValue) {
            return search(a, left, mid, target);
        } else {
            return search(a, mid + 1, right, target);
        }
    }

    public static int searchWhile(int[] a, int left, int right, int target) {
        if (a == null || a.length < 1) {
            return -1;
        }
        while (left < right - 1) {
            int mid = (left + right) >>> 1;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return a[left] == target ? left : -1;
    }
}
