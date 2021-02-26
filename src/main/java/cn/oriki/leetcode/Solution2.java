package cn.oriki.leetcode;

public class Solution2 {

    /**
     * 1568/1568个通过测试用例
     * 执行用时：2ms
     * 内存消耗：38.9MB
     *
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = false;
        ListNode firstNode = new ListNode();
        ListNode listNode = firstNode;
        while (l1 != null && l2 != null) {
            int m = flag ? 1 : 0;
            int i = (l1.val + l2.val) + m;
            flag = i / 10 == 1;
            ListNode listNode1 = new ListNode(i % 10);
            listNode.next = listNode = listNode1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            l1 = l2;
        }
        while (l1 != null) {
            int m = flag ? 1 : 0;
            int i = l1.val + m;
            flag = i / 10 == 1;
            ListNode listNode1 = new ListNode(i % 10);
            listNode.next = listNode = listNode1;
            l1 = l1.next;
        }
        if (flag) {
            listNode.next = new ListNode(1);
        }
        return firstNode.next;
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}