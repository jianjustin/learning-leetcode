public class Solution {

    public String addBinary(String a, String b) {
        String result = "";
        int num1 = a.length() , num2 = b.length() ,c = 0 , length = a.length()>b.length()?a.length():b.length();

        while (length > 0){
            int count = 0;
            if (num1 > 0)count += Integer.valueOf(a.substring(num1-1,num1--));
            if (num2 > 0)count += Integer.valueOf(b.substring(num2-1,num2--));
            if (c > 0)count += c;
            c = count >= 2 ?count/2 : 0;
            result = Integer.toString((count)%2) + result;
            length--;
        }

        if (c > 0)result = Integer.toString(c) + result;
        return result;
    }

}
