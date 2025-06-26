package Collection;
import java.util.Stack;

class SpecialStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int value) {
        mainStack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = mainStack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }
}
public class Question3 {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        System.out.println("Minimum: " + stack.getMin());
        stack.pop(); // removes 1
        System.out.println("Minimum: " + stack.getMin());
    }
}
