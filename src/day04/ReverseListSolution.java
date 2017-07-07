package day04;

import day03.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yahto on 26/06/2017.
 */
public class ReverseListSolution {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode hea = new ListNode(0);
        hea.next = head;
        ListNode p1, p2;
        p1 = head;
        p2 = head.next;
        while (p1.next != null) {
            p1.next = p2.next;
            p2.next = hea.next;
            hea.next = p2;
            p2 = p1.next;
        }
        return hea.next;
    }

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        ListNode head = ReverseList(node1);
        head.val = 3;
    }
}
