package lesson4;

import java.util.Stack;

//232. Implement Queue using Stacks
public class TaskTwo {

}

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        while (!in.empty()) {
            out.push(in.pop());
        }
        int x = out.pop();

        while (!out.empty()) {
            in.push(out.pop());
        }
        return x;
    }

    public int peek() {
        while (!in.empty()) {
            out.push(in.pop());
        }
        int x = out.peek();
        while (!out.empty()) {
            in.push(out.pop());
        }
        return x;
    }

    public boolean empty() {
        return in.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
