package cn.oriki.leetcode;

/**
 * 1491. 去掉最低工资和最高工资后的工资平均值
 * https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class Solution1491 {

    public double average(int[] salary) {
        int maxSal = salary[0];
        int minSal = salary[0];
        double sum = 0;

        for (int i : salary) {
            if (i > maxSal) {
                maxSal = i;
            }
            if (i < minSal) {
                minSal = i;
            }
            sum += i;
        }

        return (sum - maxSal - minSal) / (salary.length - 2);
    }

}
