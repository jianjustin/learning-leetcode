public class Solution {

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int m = 0 , n = s.length()-1;

        while (m < n){
            while (m < s.length() && !Character.isLetter(chars[m]))m++;
            if (m >= n)break;
            while (n < s.length() && !Character.isLetter(chars[n]))n--;
            if (m >= n)break;
            if (Character.isLetter(chars[m]) && Character.isLetter(chars[n])){
                char temp = chars[n];
                chars[n--] = chars[m];
                chars[m++] = temp;
            }
        }

        return new String(chars);
    }


}
