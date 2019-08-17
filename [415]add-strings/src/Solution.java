public class Solution {

    public String addStrings(String num1, String num2) {
        String result = "";
        int a = num1.length() , b = num2.length() ,c = 0 , length = num1.length()>num2.length()?num1.length():num2.length();

        while (length > 0){
            int count = 0;
            if (a > 0)count += Integer.valueOf(num1.substring(a-1,a--));
            if (b > 0)count += Integer.valueOf(num2.substring(b-1,b--));
            if (c > 0)count += c;
            c = count >= 10 ?count/10 : 0;
            result = Integer.toString((count)%10) + result;
            length--;
        }

        if (c > 0)result = Integer.toString(c) + result;
        return result;
    }

}
