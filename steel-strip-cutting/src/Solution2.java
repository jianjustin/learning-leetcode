public class Solution2 {
    public int bottomUpCutRod(int[] p,int n){
        int q = 0;
        int[] r = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            q = 0;
            for (int j = 1; j <= i; j++)
                q = Math.max(q,p[j-1]+r[i-j]);
            r[i] = q;
        }

        return q;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] p = {1,5,8,9,10,17,17,20,24,30};
        int n = 9;
        System.out.println(solution.bottomUpCutRod(p,n));
    }
}
