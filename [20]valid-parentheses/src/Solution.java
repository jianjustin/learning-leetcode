import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')stack.push(c);
            if (c == ')' || c == '}' || c == ']'){
                if (stack.size() == 0)return false;
                if (!isValid2(c,stack.lastElement()))return false;
                if (isValid2(c,stack.lastElement()))stack.pop();
            }
        }

        if (stack.size() > 0)return false;
        return true;
    }

    public boolean isValid2(char a , char b) {
        if (a == ')' && '(' == b)return true;
        if (a == '}' && '{' == b)return true;
        if (a == ']' && '[' == b)return true;
        return false;
    }
}
