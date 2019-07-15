public class Solution {

    public int calPoints(String[] ops) {
        int[] stack = new int[ops.length];
        int stack_top = 0;

        for (int i = 0; i < ops.length; i++) {
            String item = ops[i];
            int item_sum = 0;

            if(isNumeric(item))item_sum = new Integer(item);

            if("+".equals(item)){
                if(stack_top >= 2)item_sum = stack[stack_top-1] + stack[stack_top-2];
                if(stack_top == 1)item_sum = stack[stack_top-1];
            }

            if("C".equals(item))
                if (stack_top >= 1){
                    stack_top--;
                    stack[stack_top] = 0;
                    continue;
                }



            if("D".equals(item))
                if(stack_top >= 1)item_sum = stack[stack_top-1] + stack[stack_top-1];

            stack[stack_top] = item_sum;
            stack_top++;

        }

        int result = 0;
        for (int i = 0; i < stack.length; i++)
            result += stack[i];

        return result;

    }

    public static boolean isNumeric(String str){
        if("-".equals(str.substring(0,1)))str = str.substring(1);
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
