public class Solution {


    public String removeOuterParentheses(String S) {

        String[] stack = new String[S.length()];
        int stack_top = 0;
        int item = 0,item1 = 0;

        String result = "";
        for (int i = 0; i < S.length(); i++) {
            if(null == stack[item1]) stack[item1] = "";//初始化
            stack[item1] += S.substring(i,i+1);
            stack_top++;
            if("(".equals(S.substring(i,i+1)))item++;
            if(")".equals(S.substring(i,i+1)))item--;
            if(i>0&&item == 0)item1++;
        }

        for (int i = 0; i <= item1; i++) {
            if(null == stack[i] || "".equals(stack[i]))break;
            result += stack[i].substring(1,stack[i].length()-1);
        }

        return result;

    }
}
