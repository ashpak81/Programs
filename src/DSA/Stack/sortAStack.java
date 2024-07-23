package DSA.Stack;

import java.util.Stack;

public class sortAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(4);
        st.push(7);
        st.push(6);

        Stack<Integer> temp = new Stack<>();

        temp.push(st.pop());

        while (!st.isEmpty()) {
            int x = st.pop();
            int y = temp.peek();

            if (temp.isEmpty() || y > x) {
                temp.push(x);
            } else {
                while (!temp.isEmpty() && y < x) {
                    st.push(temp.pop());
                    if (!temp.isEmpty()) {
                        y = temp.peek();
                    }
                }
                temp.push(x);
            }
        }
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }



    }
}
