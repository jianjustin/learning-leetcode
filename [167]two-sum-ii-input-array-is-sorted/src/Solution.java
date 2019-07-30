public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if(i > 0 &&numbers[i] == numbers[i-1])continue;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
            }
        }
        return result;
    }

}
