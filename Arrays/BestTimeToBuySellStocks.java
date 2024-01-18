//best time buy and sell stocks 

public class BestTimeToBuySellStocks {
    public static int maxProfit(int[] prices) {
        int profit=0;
        int buyingPrice=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<prices.length;i++){
            profit=prices[i]-prices[index]>profit ? prices[i]-prices[index] : profit;
            if(buyingPrice>prices[i]){
                buyingPrice=prices[i];
                index=i;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
