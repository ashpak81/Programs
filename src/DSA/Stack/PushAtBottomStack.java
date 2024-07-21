package DSA.Stack;

import java.util.Stack;

public class PushAtBottomStack {

    static void pushBottom(int data , Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int top = st.pop();
        pushBottom(data , st);
         st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();

        sc.push(1);
        sc.push(2);
        sc.push(3);

        pushBottom(4,sc);

        while (!sc.isEmpty()){
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
