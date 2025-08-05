import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int popped = stack.pop();
        if (!minStack.isEmpty() && popped == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        System.out.println("Pushing -2");
        minStack.push(-2);
        System.out.println("Pushing 0");
        minStack.push(0);
        System.out.println("Pushing -3");
        minStack.push(-3);
        
        System.out.println("Current Min: " + minStack.getMin());   // Should print -3
        minStack.pop();
        System.out.println("Popped top element");
        System.out.println("Top Element: " + minStack.top());      // Should print 0
        System.out.println("Current Min: " + minStack.getMin());   // Should print -2
    }
}
