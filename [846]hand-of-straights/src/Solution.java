import java.util.TreeMap;

public class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if (null == hand || hand.length == 0)return false;
        if (hand.length % W != 0)return false;

        //手牌计数
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < hand.length; i++) {
            if (null == map.get(hand[i]))map.put(hand[i],0);
            map.put(hand[i],map.get(hand[i])+1);
        }

        for (int i = 0; i < hand.length/W; i++) {
            int first = map.firstKey();
            for (int j = first; j < first+W; j++) {
                if (!map.containsKey(j))return false;
                map.put(j,map.get(j)-1);
                if (0 == map.get(j))map.remove(j);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] hand = {1,2,3,6,2,3,4,7,8};
        System.out.println(solution.isNStraightHand(hand,3));
    }
}
