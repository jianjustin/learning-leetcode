import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<Integer>();
        int len = arr1.length;

        for (int i = 0; i < arr2.length; i++) {
            List<Integer> list1 = new ArrayList<Integer>();
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i])
                    list.add(arr1[j]);
                else
                    list1.add(arr1[j]);
            }
            arr1 = new int[list1.size()];
            for (int j = 0; j < list1.size(); j++)
                arr1[j] = list1.get(j);
        }

        int[] arr3 = new int[len];
        Arrays.sort(arr1);
        int i = 0;
        for (i = 0; i < list.size(); i++)
            arr3[i] = list.get(i);
        for (int j = 0; j < arr1.length; j++)
            arr3[i+j] = arr1[j];
        return arr3;
    }
}
