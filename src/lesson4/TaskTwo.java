package lesson4;
// https://leetcode.com/problems/implement-queue-using-stacks/ - перекидывать
// в выходной стэк элементы из входного в операциях pop и peek только когда выходной пуст
//232. Implement Queue using Stacks

import java.util.Stack;


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
