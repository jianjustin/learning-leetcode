import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {


    public int repeatedNTimes(int[] A) {
       int[][] a = new int[A.length][2];
       int size = 0;
       for (int i = 0; i < A.length; i++) {
           for (int j = 0; j < a.length; j++) {
                if(a[j][0] == A[i]){
                    if(a[j][1] == 0)size++;
                    a[j][1]++;
                    break;
                }
                if(j == a.length -1){
                    a[size][0] = A[i];
                    a[size][1] = 1;
                    size++;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if(a[i][1] == A.length/2)return a[i][0];
        }

        return -1;
    }

}
