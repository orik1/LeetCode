package cn.oriki.leetcode;

/**
 * 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class Solution283 {

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int m = index; m < nums.length; m++) {
            nums[m] = 0;
        }
    }

}
