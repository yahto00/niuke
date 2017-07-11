package day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yahto on 11/07/2017.
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.remove();
            list.add(temp.val);
            if (temp != null){
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return list;
    }
}
