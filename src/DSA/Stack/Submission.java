package DSA.Stack;

import java.util.Stack;

public class Submission {

    public static void main(String[] args) {

//        Declare a stack to store Integer values. Add elements from 0 to 10 to the stack.
//        After adding print out the values only if they are odd integers and pop that value

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < 11 ; i++){
            st.push(i);
        }

        while (!st.isEmpty()){
            int i = st.pop();
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
