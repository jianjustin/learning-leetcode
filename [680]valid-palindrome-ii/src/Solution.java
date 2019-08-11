public class Solution {

    public boolean validPalindrome(String s) {
        int m = 0 , n = s.length()-1 , k = 0;
        while (m < n) {
         if (s.charAt(m) == s.charAt(n)){
             m++;
             n--;
         }
         if(k >= 1)return false;
         if(validPalindrome1(s.substring(m+1,n+1)))return true;
         if(validPalindrome1(s.substring(m,n)))return true;
         if(!validPalindrome1(s.substring(m+1,n+1))&&!validPalindrome1(s.substring(m,n)))k++;

        }
        return true;
    }

    public boolean validPalindrome1(String s) {
        int m = 0 , n = s.length()-1;
        while (m < n) {
            if (s.charAt(m) != s.charAt(n))return false;
            m++;
            n--;

        }
        return true;
    }

}
