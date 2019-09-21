import java.util.ArrayList;

/**
 * 钢条切割问题
 */
public class Solution {
     ArrayList a;
    public int cutting(int[] p , int n){
        int q = 0;
        if (0 == n)return 0;
        for (int i = 1; i <= n; i++)
            q = Math.max(q,p[i-1]+cutting(p,n-i));
        return q;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        int n = 10;
        System.out.println(solution.cutting(p,n));
    }
}
