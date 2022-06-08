import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Best_Time_To_Buy_And_Sell_Stock {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<prices.size();i++){
            if (prices.get(i)<minPrice){
                minPrice=prices.get(i);
            }
            else if (prices.get(i)-minPrice>maxProfit){
                maxProfit=prices.get(i)-minPrice;
            }
        }
        return maxProfit;
    } 
}
