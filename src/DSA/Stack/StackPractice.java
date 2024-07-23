package DSA.Stack;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {

        String str1 = "Hello How Are You";
        String ans = "";

        // Using O(n) time

        Stack<String> st = new Stack<>();

        String add = "";
        for (int i = str1.length() - 1; i >= 0; i--){
             add += str1.charAt(i);
             if(str1.charAt(i) == ' '){
                 st.push(add);
                 add = "";
             }
        }

        st.push(add);

        while (! st.isEmpty()){
            ans += st.pop();
            ans += " ";
        }

        System.out.println(ans);

        // Using Array
//
//        String ans = "";
//
//        Stack<String> st = new Stack<>();
//
//        String[] str = str1.split(" ");
//
//        for (int i = 0; i < str.length; i++) {
//            st.push(str[i]);
//        }
//
//        Stack<String> temp = new Stack<>();
//
//        while (!st.isEmpty()) {
//            String word = st.peek();
//            String rev = "";
//
//            for (int i = word.length() - 1; i >= 0; i--) {
//                rev += word.charAt(i);
//            }
//
//            temp.push(rev);
//            st.pop();
//        }
//
//        while (!temp.isEmpty()) {
//            st.push(temp.pop());
//            System.out.println(st.peek());
//            ans += st.peek();
//            ans += " ";
//        }
//
//        System.out.println(ans);

    }
}
