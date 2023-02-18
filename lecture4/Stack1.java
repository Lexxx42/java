package java_gb.lecture4;

import java.util.*;

import static java.lang.Character.isDigit;


public class Stack1 {
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp); // postfix form
        //System.out.println(isDigit('1')); // postfix form

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit('1')) {  //isDigit(exp[i])
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}

