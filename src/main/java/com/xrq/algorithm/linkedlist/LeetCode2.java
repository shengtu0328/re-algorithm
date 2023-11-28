package com.xrq.algorithm.linkedlist;

/**
 * https://leetcode.cn/problems/add-two-numbers/
 */
public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode l = new ListNode(-1);

        ListNode p = l;
        int carry = 0;

        //如果两个链表都还有值时
        while (p1 != null && p2 != null) {
            int sum = carry + p1.val + p2.val;
            if (sum >= 10) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }

            p1 = p1.next;
            p2 = p2.next;
            p.next = new ListNode(sum);
            p = p.next;
        }

        //如果两个链表长度不一样时，取较长的那个
        ListNode p3 = (p1 != null ? p1 : p2);
        while (p3 != null) {
            int sum = carry + p3.val;
            if (sum >= 10) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }

            p3 = p3.next;
            p.next = new ListNode(sum);
            p = p.next;
        }

        //如果情况是 最终结果的位数比最长的那个位数还大一位
        if (carry == 1) {
            p.next = new ListNode(1);
        }

        return l.next;

    }

}
