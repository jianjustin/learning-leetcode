public class Solution {

    public int fib(int N) {
        if(0 == N)return 0;
        if(1 == N)return 1;
        return fib(N-1) + fib(N-2);
    }
}
