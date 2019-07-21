public class Solution {

    public int numJewelsInStones(String J, String S) {
        int result = 0;

        for (int i = 0; i < S.length(); i++) {
            String item = S.substring(i,i+1);
            if(J.indexOf(item) > -1)result++;
        }

        return result;
    }
}
