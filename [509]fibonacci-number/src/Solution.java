public class Solution {

    public int fib(int N) {
        if(0 == N)return 0;
        if(1 == N)return 1;
        int a = 0,b = 1;
        for(int i = 0 ; i <= N-2 ; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
