public class Solution {

    public int arrayPairSum(int[] nums) {
        insertSort(nums);//had sort

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2 == 0)result += nums[i];
        }

        return result;
    }

    public static void insertSort(int[] a) {
        int i, j, insertNote;
        for (i = 1; i < a.length; i++) {
            insertNote = a[i];
            j = i - 1;
            while (j >= 0 && insertNote < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = insertNote;
        }
    }
}
