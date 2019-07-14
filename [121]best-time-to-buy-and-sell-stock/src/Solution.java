public class Solution {

    public int maxProfit(int[] prices) {
        int resultMoney = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int money = prices[j] - prices[i];
                if(resultMoney < money)resultMoney = money;
            }
        }

        return resultMoney;
    }
}
