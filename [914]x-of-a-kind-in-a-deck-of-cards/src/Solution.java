import java.util.*;

public class Solution {

    public boolean hasGroupsSizeX(int[] deck) {
        boolean result = true;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < deck.length; i++) {
            if (null == map.get(deck[i]))map.put(deck[i],0);
            map.put(deck[i],map.get(deck[i])+1);
        }

        int num = -1 , key = 0;
        Iterator<Integer> iterator = map.keySet().iterator();
        int[] nums = new int[map.size()];
        while (iterator.hasNext()){
            int item_size = map.get(iterator.next());
            if (num < item_size)
                num = item_size;
            nums[key++] = item_size;
        }

        int value = getMoreBigDiv(nums,nums.length);
        if(value < 2)result = false;


        return result;

    }

    public static int getMoreBigDiv(int num[], int n) { // 求多个数的最大公约数
        if (n == 1)
            return num[n - 1];
        return getBigDiv(num[n - 1], getMoreBigDiv(num, n - 1));
    }

    public static int getBigDiv(int a, int b) {// 求两个数的最大公约数
        if (b == 0)
            return a;
        return getBigDiv(b, a % b);
    }


}
