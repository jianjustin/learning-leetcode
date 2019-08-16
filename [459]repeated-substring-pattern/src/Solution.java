public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        int a = 0 , b = 1 , length = s.length();
        while (b < length){
            if (length%b != 0){
                b++;
                continue;
            }
            String child = s.substring(a,b);
            String s1 = s.replaceAll(child,"");
            if ("".equals(s1))return true;
            b++;
        }
        return false;
    }

}
