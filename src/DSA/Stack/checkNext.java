package DSA.Stack;

import java.util.Stack;

public class checkNext {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(7);
        st.push(6);
        st.push(1);
        st.push(2);

        while (!st.isEmpty()) {
            int x = st.pop();


            if(st.isEmpty()){
                System.out.println(x + " - > " + "-1");
                break;
            }
            if (x < st.peek()){
                System.out.println(x + " - >" + st.peek());
            } else if (x > st.peek()) {
                int temp = st.pop();
                System.out.println(x + " - >" + st.peek());
                st.push(temp);
            }

        }

    }
}
