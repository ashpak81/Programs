package DSA.Stack;

import java.util.Stack;

public class BalanceParentheses {

    public static void main(String[] args) {

        String par = "[{()}}";

        Stack<Character> st = new Stack<>();

        boolean ans = true;
        for (int i = 0; i < par.length(); i++) {
            char c = par.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (!st.isEmpty()) {
                    char t = st.pop();
                    if (c == ')' && t != '(' || c == ']' && t != '[' || c == '}' && t != '{') {
                        ans = false;
                        break;
                    }
                } else {
                    ans = false;
                }
            }
        }
        System.out.println(ans);
    }

}
