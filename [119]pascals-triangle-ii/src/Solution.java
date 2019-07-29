import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int numRows) {
        if (numRows <= 0)return null;
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 0; i <= numRows; i++) {
            List<Integer> list_item = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    list_item.add(1);
                else
                    list_item.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(list_item);
        }
        return list.get(numRows);
    }
}
