public class Solution {

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int m = 0 , n = s.length()-1;

        while (m < n){
            while (m < s.length() && !isvowel(chars[m]))m++;
            if (m >= n)break;
            while (n < s.length() && !isvowel(chars[n]))n--;
            if (m >= n)break;
            if (isvowel(chars[m]) && isvowel(chars[n])){
                char temp = chars[n];
                chars[n--] = chars[m];
                chars[m++] = temp;
            }
        }

        return new String(chars);
    }

    public boolean isvowel(char c){
        String s = "aeiouAEIOU";
        return s.indexOf(Character.toString(c)) > -1;
    }


}
