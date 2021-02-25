package cn.oriki.leetcode;

import java.util.Arrays;

public class Solution867 {

    /**
     * 36/36个通过测试用例
     * 执行用时：1ms
     * 内存消耗：39.2MB
     */
    public int[][] transpose(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] ints = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ints[j][i] = matrix[i][j];
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        new Solution867().test();
        new Solution867().test2();
    }

    public void test() {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = new Solution867().transpose(ints);
        int[][] ints1 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assert Arrays.equals(ints1, transpose);
    }

    public void test2() {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = new Solution867().transpose(ints);
        int[][] ints1 = {{1, 4}, {2, 5}, {3, 6}};
        assert Arrays.equals(ints1, transpose);
    }

}
