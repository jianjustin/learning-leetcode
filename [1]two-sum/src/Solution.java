public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            //if(nums[i] > target)continue;
            for (int j = i+1; j < nums.length; j++) {
                //if(nums[j] > target)continue;
                if(target == (nums[i]+nums[j])){
                    result[0] = i;
                    result[1] = j;
                }

            }

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
