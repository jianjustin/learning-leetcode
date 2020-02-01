public class Solution {
    public String intToRoman(int num) {
        if (0 == num)return "";
        int values[]=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String strs[]=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String result = "";
        for (int i = 0; i < values.length; i++) {
            if (0 < num && num >= values[i]){
                for (int j = 0; j < num/values[i]; j++)
                    result += strs[i];
                num %= values[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.intToRoman(4));
    }


}
