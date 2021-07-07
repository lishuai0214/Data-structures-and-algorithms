package Coding;

public class StockMaxProfit {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 两次交易所能获得的最大收益
     * @param prices int整型一维数组 股票每一天的价格
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int max=0, min=0;
        int profit = 0;
        int lenght = prices.length;
        for (int i=0; i<lenght; i++){
            if (prices[i] < prices[min]){
                min = i;
            }else if (prices[i] > prices[max]){
                max = i;
            }
            if (min < max){
                profit = prices[max] - prices[min];
            }
        }
        return profit;
    }
}
