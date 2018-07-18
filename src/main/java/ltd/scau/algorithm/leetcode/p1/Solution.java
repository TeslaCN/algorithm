package ltd.scau.algorithm.leetcode.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Weijie Wu
 *
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(need, i);
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.test(new int[]{2, 7, 11, 15}, 9);
    }

    public void test(int nums[], int target) {
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
