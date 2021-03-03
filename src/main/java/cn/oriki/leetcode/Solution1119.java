package cn.oriki.leetcode;

public class Solution1119 {

    /**
     * 21/21个通过测试用例
     * 执行用时：1ms
     * 内存消耗：36.4MB
     */
    public String removeVowels(String s) {
        return s.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
    }

    /**
     * 21/21个通过测试用例
     * 执行用时：4ms
     * 内存消耗：36.8MB
     */
    @Deprecated
    public String _removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            String m = s.charAt(i) + "";
            if (!"aeiou".contains(m)) {
                sb.append(m);
            }
        }
        return sb.toString();
    }

}
