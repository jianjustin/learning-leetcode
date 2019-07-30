public class Solution {

    public boolean isMonotonic(int[] A) {
        int a = 0 , b = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] < A[i+1])a = 1;
            if(A[i] > A[i+1])b = 1;
        }
        if(a > 0 && b > 0)return false;
        return true;
    }


}
