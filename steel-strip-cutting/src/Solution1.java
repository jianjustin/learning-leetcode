public class Solution1 {
    public int memoizedCutRod(int[] p , int n){
        int[] r = new int[n+1];
        return memoizedCutRod(p,n,r);
    }

    public int memoizedCutRod(int[] p , int n , int[] r){
        int q = 0;
        if (r[n] > 0)return r[n];
        for (int i = 1; i <= n ; i++)
            q = Math.max(q,p[i-1]+memoizedCutRod(p,n-i,r));
        r[n] = q;
        return q;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        int n = 9;
        System.out.println(solution1.memoizedCutRod(p,n));
    }
}
