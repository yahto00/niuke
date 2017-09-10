package day08;

import java.util.Stack;

/**
 * Created by yahto on 08/09/2017.
 * 实现一个特殊栈 使得可以返回最小的元素 并且pop push getMin操作都为O(1)
 */

public class MyStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MyStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    /**
     * 压栈操作
     * dataStack正常压栈
     * minStack:如果当前栈没有元素 直接压栈；如果有元素 比较data和栈顶元素，若data大于栈顶元素 不压栈，反之压栈
     *
     * @param data
     */
    public void push(int data) {
        dataStack.push(data);
        if (minStack.empty()) {
            minStack.push(data);
        } else {
            if (data <= minStack.peek()) {
                minStack.push(data);
            }
        }
    }

    /**
     * 出栈操作
     * dataStack正常出栈
     * minStack:若dataStack出栈元素等于当前栈顶元素 minStack出栈；反之不出栈
     *
     * @return
     */
    public Integer pop() {
        if (dataStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        Integer data = dataStack.pop();
        if (data == minStack.peek()) {
            minStack.pop();
        }
        return data;
    }

    /**
     * 得到最小值
     * 直接从minStack中查看栈顶元素
     *
     * @return
     */
    public Integer getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

}
