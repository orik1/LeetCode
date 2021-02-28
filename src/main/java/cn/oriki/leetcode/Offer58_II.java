package cn.oriki.leetcode;

public class Offer58_II {

    public String reverseLeftWords(String s, int n) {
        if (n > s.length()) {
            return s;
        }
        s += s.substring(0, n);
        return s.substring(n);
    }

    public static void main(String[] args) {
        new Offer58_II().test();
        new Offer58_II().test2();
    }

    private void test() {
        String abcdefg = new Offer58_II().reverseLeftWords("abcdefg", 2);
        assert "cdefgab".equals(abcdefg);
    }

    private void test2() {
        String abcdefg = new Offer58_II().reverseLeftWords("abcdefg", 8);
        assert "abcdefg".equals(abcdefg);
    }

}
