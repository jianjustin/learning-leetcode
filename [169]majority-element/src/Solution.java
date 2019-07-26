import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(null == map.get(nums[i]))map.put(nums[i],0);
            map.put(nums[i],map.get(nums[i])+1);
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        int max_value =0 , max_key = 0;
        while (iterator.hasNext()){
            int key = iterator.next();
            if (max_value < map.get(key)){
                max_key = key;
                max_value = map.get(key);
            }
        }

        return max_key;
    }

}
