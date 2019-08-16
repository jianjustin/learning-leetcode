public class Solution {

    public boolean isLongPressedName(String name, String typed) {
        int m = 0 , n = 0;
        while (m < name.length()){
            if (n == typed.length())return false;
            if (name.charAt(m) == typed.charAt(n)){
                m++;
                n++;
            }else {
                if (m > 0 && name.charAt(m-1) == typed.charAt(n))
                    n++;
                else
                    return false;
            }
        }
        return true;
    }

}
