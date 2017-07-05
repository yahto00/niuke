package day04;

import day03.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yahto on 26/06/2017.
 */
public class ReverseListSolution {
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode index = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (index!=null){
            stack.push(index);
            index = index.next;
        }
        head = stack.pop();
        ListNode lastNode = null;
        ListNode tempNode = head;
        while (!stack.isEmpty()){
            lastNode = stack.pop();
            tempNode.next = lastNode;
            tempNode = lastNode;
        }
        return head;
    }
}
