public class Solution {

    public boolean judgeCircle(String moves) {
        int m = 0 , n = 0;
        for (int i = 0; i < moves.length(); i++) {
            String str = moves.substring(i,i+1);
            if ("R".equals(str))m++;
            if ("L".equals(str))m--;
            if ("U".equals(str))n++;
            if ("D".equals(str))n--;
        }

        if (m == 0 && n == 0)return true;
        return false;
    }
}
