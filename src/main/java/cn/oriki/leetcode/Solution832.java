package cn.oriki.leetcode;

import java.util.Arrays;

public class Solution832 {

    /**
     * 82/82 个通过测试用例
     * 执行用时：1ms
     * 内存消耗：38.9MB
     * <p>
     * 2021-02-24
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                int index = A[i].length - j - 1;
                int temp = A[i][j];
                A[i][j] = A[i][index];
                A[i][index] = temp;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] ^= 1;
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