package ltd.scau.algorithm.leetcode.p4;

/**
 * @author Weijie Wu
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * <p>
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 中位数是 (2 + 3)/2 = 2.5
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            int[] t = nums1;
            nums1 = nums2;
            nums2 = t;
        }

        int[] a = nums1, b = nums2;
        int len1 = a.length;
        int len2 = b.length;

        if (len1 == 0) {
            if (len2 % 2 == 1) {
                return b[len2 / 2];
            } else {
                return (b[len2 / 2] + b[len2 / 2 - 1]) / 2.0;
            }
        }

        int half = (len1 + len2 + 1) / 2;
        int iMin = 0, iMax = len1;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = half - i;
            if (i < iMax && b[j - 1] > a[i]) {
                iMin++;
            } else if (iMin < i && a[i - 1] > b[j]) {
                iMax--;
            } else {
                if ((len1 + len2) % 2 == 0) {
                    if (i == 0) {
                        if (j < len2) {
                            return (b[j - 1] + Math.min(b[j], a[i])) / 2.0;
                        } else {
                            return (b[j - 1] + a[i]) / 2.0;
                        }
                    } else if (j == 0) {
                        return (b[j] + a[i - 1]) / 2.0;
                    } else if (i == len1) {
                        return (Math.max(a[i - 1], b[j - 1]) + b[j]) / 2.0;
                    } else {
                        return (Math.max(b[j - 1], a[i - 1]) + Math.min(b[j], a[i])) / 2.0;
                    }
                } else {
                    if (i == 0) {
                        return b[j - 1];
                    } else {
                        return Math.max(b[j - 1], a[i - 1]);
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a, b;
//        a = new int[]{1, 3, 4, 6, 8, 9};
//        b = new int[]{2, 3, 11, 17, 21};
        a = new int[]{3};
        b = new int[]{1, 2, 4};
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(a, b));
//        a = new int[]{1, 3, 4, 6, 8, 9};
//        b = new int[]{2, 3, 11, 14, 17, 21};
//        System.out.println(s.findMedianSortedArrays(a, b));
    }
}
