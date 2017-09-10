package day08;

import java.util.Stack;

/**
 * Created by yahto on 08/09/2017.
 * 用两个栈来实现一个队列
 */
public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    /**
     * 入队
     * 直接入队
     *
     * @param data
     */
    public void add(int data) {
        stackPush.push(data);
    }

    /**
     * 出队
     * 调用poll()后再出队
     *
     * @return
     */
    public Integer pop() {
        poll();
        return stackPop.pop();
    }

    /**
     * 查看队头元素
     * 调用poll后在查看元素
     *
     * @return
     */
    public Integer peek() {
        poll();
        return stackPop.peek();
    }

    /**
     * 若stackPop为空，将stackPush栈中元素全部倒入stackPop中
     */
    private void poll() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }
}
