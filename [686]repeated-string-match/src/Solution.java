public class Solution {

    public int repeatedStringMatch(String A, String B) {
        int m = 1 , n = A.length();
        String a = A;
        while (m*n < 2*n+B.length()){
           if (a.indexOf(B) > -1)
               return m;
           m++;
           a += A;
        }
        return -1;
    }
}
