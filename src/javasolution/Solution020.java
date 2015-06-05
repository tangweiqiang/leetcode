package javasolution;

import java.util.Stack;

/**
 * Created by 汤伟强 on 2015/6/5.
 */
public class Solution020 {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        String str="()[]{}";
        for (int i = 0; i < s.length(); i++) {
            int pos = str.indexOf(s.charAt(i));
            if (pos % 2 == 1){
                if (stack.isEmpty() || stack.pop() != pos - 1)
                    return  false;
            }else
                stack.push(pos);
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

    }
}
