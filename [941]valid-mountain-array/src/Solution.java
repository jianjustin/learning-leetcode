public class Solution {

    public boolean validMountainArray(int[] A) {
        boolean flag = false;
        if(A.length == 0)return flag;
        int max = A[0],min = A[0],item = 0,item2 = 0,m = 0;
        for (int i = 1; i < A.length; i++) {
            if(A[i] > A[i-1]) {
                max = A[i];
                item = i;
                if(m == 1)m = -1;
            }
            if(A[i] < A[i-1]) {
                min = A[i];
                item2 = i;
                if(m == 0)m = 1;
            }
            if(A[i] == A[i-1])m = -1;
        }
        if(item > 0 && item < A.length-1 && item2 == A.length-1)
            flag = true;
        if(m == -1)
            flag = false;

        return flag;
    }
}
