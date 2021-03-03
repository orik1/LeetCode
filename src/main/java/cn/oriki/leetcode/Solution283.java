package cn.oriki.leetcode;

public class Solution283 {

    /**
     * 21/21个通过测试用例
     * 执行用时：Oms
     * 内存消耗：38.9MB
     */
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
