package day03;

import java.util.Stack;

/**
 * Created by yahto on 20/06/2017.
 */
public class StackSolution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("stack is empty");
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        int result = stack1.pop();
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return result;
    }
}
