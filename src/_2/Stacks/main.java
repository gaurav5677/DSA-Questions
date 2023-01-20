package _2.Stacks;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();// this is how we declare stack
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek()+ "  " + st.size());
        st.pop();// this will delete the topmost element form the stack
        System.out.println(st.peek()+ "  " + st.size());
        st.pop();
        System.out.println(st.peek()+ "  " + st.size());
        st.pop();

    }
}
