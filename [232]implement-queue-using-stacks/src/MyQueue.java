import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    public List<Integer> list = new ArrayList<Integer>();
    public int stack_top = 0;

    /** Initialize your data structure here. */
    public MyQueue() {
        list = new ArrayList<Integer>();
        stack_top = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);
        stack_top++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        stack_top--;
        return list.remove(0);
    }

    /** Get the front element. */
    public int peek() {
        if(stack_top == 0)return -1;
        return list.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack_top == 0 ? true : false;
    }
}
