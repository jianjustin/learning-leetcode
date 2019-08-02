public class Solution {

    public int[] plusOne(int[] digits) {
        int value = 0 , item = 1 , key = 0;
        for (int i = digits.length-1; i >= 0 ; i--) {
            digits[i] = digits[i] + 1;
            key = 0;
            if(10 == digits[i]){
                digits[i] = 0;
                key = 1;
            }
            if (key == 0)break;
        }

        if (1 == key){
            int[] result = new int[digits.length+1];
            for (int i = 0; i < result.length; i++) {
                if (0 == i)
                    result[i] = 1;
                else
                    result[i] = digits[i-1];
            }
            return result;
        }

        return digits;
    }

}
