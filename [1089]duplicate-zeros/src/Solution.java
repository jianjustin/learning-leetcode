public class Solution {

    public void duplicateZeros(int[] arr) {
        int[] arr1 = new int[arr.length];
        int key = 0;
        for (int i = 0; i < arr.length; i++) {
            if(key >= arr.length)break;
            if(arr[i] == 0)
                key += 2;
            else
                arr1[key++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = arr1[i];
    }

}
