package cn.oriki.leetcode.anki;

/**
 * https://leetcode-cn.com/problems/binary-search/
 */
public class Solution704 {

    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (target < nums[mid]) {
                max = mid - 1;
            } else if (target > nums[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
