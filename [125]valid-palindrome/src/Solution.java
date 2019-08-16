public class Solution {

    public boolean isPalindrome(String s) {
        int a = 0 , b = s.length()-1;

        while (a < b) {
            if(!Character.isLetterOrDigit(s.charAt(a)))a++;
            if(!Character.isLetterOrDigit(s.charAt(b)))b--;
            if (Character.isLetterOrDigit(s.charAt(a)) && Character.isLetterOrDigit(s.charAt(b))){
                if (Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b)))
                    return false;
                a++;
                b--;
            }
        }
        return true;
    }
    
}
