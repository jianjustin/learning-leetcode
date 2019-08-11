import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean buddyStrings(String A, String B) {
        int a = -1 , b = -1;
        if ("".equals(A)&&"".equals(B))return false;
        if (A.length() != B.length())return false;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i))continue;
            if (a == -1)
                a = i;
            else
                b = i;
        }
        if (b == -1)
            if (a == -1){
                return checkDifferent(A) ? false : true;
            }else
                return false;
        if (a != -1 && b != -1)
            if(A.charAt(a) != B.charAt(b) || A.charAt(b) != B.charAt(a))
                return false;
        return true;
    }

    public static boolean checkDifferent(String iniString) {
        String[] a = iniString.split("");
        Set a1 = new HashSet();
        for(int i=0; i<a.length; i++) {
            a1.add(a[i]);
        }
        Object[] b = a1.toArray();
        return a.length == b.length;
    }

}
