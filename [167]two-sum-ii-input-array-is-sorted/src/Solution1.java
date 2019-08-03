public class Solution1 {

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] result = new int[2];
        for (int left = 0; left < numbers.length - 1; left++) {
            int right = binarySearch(numbers, left + 1, len - 1, target - numbers[left]);
            if (right != -1)
                result =  new int[]{left + 1, right + 1};
        }
        return result;
    }

    public int binarySearch(int[] arr, int start, int end, int hkey){
        if (start > end) return -1;
        int mid = start + (end - start)/2;
        if (arr[mid] > hkey)
            return binarySearch(arr, start, mid - 1, hkey);
        if (arr[mid] < hkey)
            return binarySearch(arr, mid + 1, end, hkey);
        return mid;

    }
}
