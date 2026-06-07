package Week1.Day1;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = 0 , min = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++){
            min = Math.min(prices[i],min);
            maxProfit = Math.max(maxProfit , prices[i]-min);
        }
        System.out.println("Max Profit : " + maxProfit);
    }
}
