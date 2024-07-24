package DSA.Stack;

import java.util.Stack;

public class checkNext {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(2);
        stack.push(2);
        stack.push(5);
        stack.push(2);

        Stack<Integer> tempStack = new Stack<>();


        while (!stack.isEmpty()) {

            int current = stack.pop();

            while (! tempStack.isEmpty() && tempStack.peek() <= current) {
                tempStack.pop();
            }

            if (tempStack.isEmpty()) {
                System.out.println(current + " -> " + "-1");
            } else {
                System.out.println(current + " -> " + tempStack.peek());
            }

            tempStack.push(current);
        }
        
    }
}
