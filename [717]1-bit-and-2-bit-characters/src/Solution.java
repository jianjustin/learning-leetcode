public class Solution {

    public boolean isOneBitCharacter(int[] bits) {
        int count = 0, i = bits.length-2;
        while(i>=0&&bits[i--]==1)count = count == 0 ? 1 : 0;
        return count == 0;
    }
}
