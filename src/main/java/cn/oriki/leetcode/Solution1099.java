package cn.oriki.leetcode;

import java.util.Arrays;

/**
 * 1099. 小于 K 的两数之和
 * https://leetcode-cn.com/problems/two-sum-less-than-k/
 */
public class Solution1099 {

    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);

        int max = nums.length - 1;
        int sumMax = -1;

        for (int min = 0; min < max; ) {
            int temp = nums[min] + nums[max];
            if (temp >= k) {
                max--;
            } else {
                sumMax = Math.max(sumMax, temp);
                min++;
            }
        }
        return sumMax;
    }

}
