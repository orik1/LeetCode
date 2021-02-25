package cn.oriki.leetcode;

public class Solution66 {

    /**
     * 111 / 111 个通过测试用例
     * 执行用时: 0 ms
     * 内存消耗: 36.7 MB
     */
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = ++digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] ints = new int[length + 1];
        ints[0] = 1;
        System.arraycopy(digits, 0, ints, 1, ints.length - 1);
        return ints;
    }

    public static void main(String[] args) {
        new Solution66().test();
        new Solution66().test2();
        new Solution66().test3();
    }

    private void test() {
        int[] ints = {0};
        int[] ints1 = plusOne(ints);
        assert ints[ints1.length - 1] == 1;
    }

    private void test2() {
        int[] ints = {4, 3, 2, 1};
        int[] ints1 = plusOne(ints);
        assert ints[ints1.length - 1] == 2;
    }

    private void test3() {
        int[] ints = {9, 9, 9};
        int[] ints1 = plusOne(ints);
        assert 4 == ints1.length;
    }

}
