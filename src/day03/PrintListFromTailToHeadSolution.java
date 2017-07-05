package day03;

import java.util.ArrayList;

/**
 * Created by yahto on 20/06/2017.
 */
public class PrintListFromTailToHeadSolution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int top = -1;
        while (listNode != null){
            arrayList.add(listNode.val);
            top++;
            listNode = listNode.next;
        }
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        for (;top >= 0;top --){
            finalList.add(arrayList.get(top));
        }
        return finalList;
    }
}
