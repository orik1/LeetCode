package cn.oriki.leetcode.anki;

/**
 * https://leetcode-cn.com/problems/remove-vowels-from-a-string/
 */
public class Solution1119 {

    public String removeVowels(String s) {
        return s.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
    }

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
