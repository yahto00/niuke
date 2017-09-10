package day08;

import java.util.Stack;

/**
 * Created by yahto on 10/09/2017.
 * 利用递归函数和栈操作逆序一个栈
 * 一个栈压入1，2，3，4，5 栈顶到栈底依次为 5，4，3，2，1 转置后 栈顶到栈底为 1，2，3，4，5
 * 只能用递归函数实现 不用其他的数据结构
 */
public class ReverseStack {
    /**
     * 拿到栈底元素
     *
     * @param stack
     * @return
     */
    public Integer getAndRemoveLastElement(Stack<Integer> stack) {
        Integer result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            Integer last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    /**
     * 递归拿到栈底元素 依次压栈
     *
     * @param stack
     */
    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Integer i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
