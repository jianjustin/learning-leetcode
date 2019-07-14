import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int maxArea(int[] height) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < height.length; i++) {
            list.add(height[i]);
        }

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if(i==j)continue;
                int h = Math.abs(i-j);
                int w = height[i];
                if(height[j]<w)w = height[j];
                if(w*h>max)max = w*h;
            }
        }
        return max;
    }
}
