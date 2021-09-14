import java.util.Arrays;

public class Stocks {

    public static void main(String[] args) {

        //Time Complexity = O(n)
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Given Array: " + Arrays.toString(prices));
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price = prices[i];
            }
            else if(prices[i] - min_price > max_profit){
                max_profit = prices[i] - min_price;
            }
        }
        System.out.println("Max Profit = " + max_profit);

    }
}
