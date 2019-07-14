public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int[] b = new int[A.length];
        int m = 0,n = A.length -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 == 0)
                b[m++] = A[i];
            else
                b[n--] = A[i];
        }

        return b;
    }
}
