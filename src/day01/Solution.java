package day01;

import java.util.ArrayList;

/**
 * Created by yahto on 31/05/2017.
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode temp = head;
        ListNode index = head;
        int i = 0;
        for (; i < k; i++) {
            if (index == null)
                break;
            index = index.next;
        }
        if (i < k) {
            return null;
        }
        while (index != null) {
            temp = temp.next;
            index = index.next;
        }
        return temp;
    }

    public String ReverseSentence(String str) {
        if (str.length() == 0 || str.equals("")){
            return "\""+"\"";
        }
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {
            sb.append(arr[i] + " ");
        }
        sb.append(arr[0]);
        return sb.toString();
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


