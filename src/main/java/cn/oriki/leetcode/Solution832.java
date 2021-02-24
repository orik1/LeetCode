package cn.oriki.leetcode;

import java.util.Arrays;

public class Solution832 {

    /**
     * 82/82 个通过测试用例
     * 执行用时：1ms
     * 内存消耗：38.8MB
     * <p>
     * 2021-02-24
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] ints : A) {
            for (int i = 0; i < ints.length / 2 + ints.length % 2; i++) {
                int temp;
                temp = ints[i];
                ints[i] = ints[ints.length - i - 1];
                ints[ints.length - i - 1] = temp;
            }
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 0) {
                    ints[i] = 1;
                } else {
                    ints[i] = 0;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ints = new Solution832().flipAndInvertImage(array);
        boolean equals = Arrays.equals(ints, new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}});
        assert equals;

        int[][] array2 = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] ints2 = new Solution832().flipAndInvertImage(array2);
        boolean equals2 = Arrays.equals(ints2, new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}});
        assert equals2;
    }


}