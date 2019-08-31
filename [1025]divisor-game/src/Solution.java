public class Solution {

    public boolean divisorGame(int N) {
        boolean m = false , n = false , result = false;
        for (int i = 1; i < N; i++) {
            if (0 == N%i){
                m = true;
                n = divisorGame(N-i);
            }
        }
        return false;
    }

}
