 

import java.util.*;
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Fractional_Knapsack {
    static class ItemComparator implements Comparator<Pair>{
        public int compare(Pair a,Pair b){
            double r1=(double)(a.value)/(double)(a.weight);
            double r2=(double)(b.value)/(double)(b.weight);
            if (r1<r2) return 1;
            else if (r1>r2) return -1;
            else return 0;
        }
    }
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
        Arrays.sort(items,new ItemComparator());
        int currWeight=0;
        double finalVal=0.0;
        for (int i=0;i<n;i++){
            if (currWeight+items[i].weight<=w){
                currWeight += items[i].weight;
                finalVal+=items[i].value;
            }else{
                int remain=w-currWeight;
                finalVal+=((double)items[i].value/(double)items[i].weight)*(double) remain;
                break;
            }
        }
        return finalVal;
    }
}
