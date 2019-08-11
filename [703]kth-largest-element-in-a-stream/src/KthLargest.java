import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthLargest {

    private List<Integer> list;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.list = new ArrayList<Integer>(k+1);
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < k && i < nums.length; i++)
            list.add(nums[nums.length -i-1]);
        while (i++ < k)
            list.add(Integer.MIN_VALUE);
        Collections.sort(list);

    }

    public int add(int val) {
        if (val < list.get(0))return list.get(0);
        list.remove(0);
        list.add(val);
        Collections.sort(list);
        return  list.get(list.size() - k);
    }
}
