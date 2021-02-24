package cn.oriki.leetcode;

public class Solution1 {

    /**
     * 53/53 个通过测试用例
     * 执行用时：0ms
     * 内存消耗：38.7MB
     * <p>
     * 2020-02-23
     */
    public int[] twoSum(int[] nums, int target) {
        int arrayLength = nums.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
//        [2,7,11,15]
//        9
        int[] ints = new Solution1().twoSum(new int[]{2, 7, 11, 15}, 9);
        assert ints[0] == 2;
        assert ints[1] == 7;
    }

}
