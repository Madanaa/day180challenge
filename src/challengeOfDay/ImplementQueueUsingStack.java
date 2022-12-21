package challengeOfDay;

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }
    public void pop() {
        peek();
        output.pop();
    }
    public int peek() {
        if (output.empty())
            while (!input.empty()) {
                output.push(input.pop());
            }
        return output.peek();
    }
    public boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack q = new ImplementQueueUsingStack();
        q.push(1);
        q.push(2);
        q.peek();
        q.pop();
        q.empty();

    }
}
