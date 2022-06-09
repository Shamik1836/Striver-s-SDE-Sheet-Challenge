
// Bayer Moore Voting Algo

import java.util.* ;
import java.io.*; 
public class MajorityElement {
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int count=0;
        int candidate=-1;
        for (int num:arr){
            if (count==0){
                candidate=num;
                count=1;
                continue;
            }
             if (num==candidate){
                count=count+1;
            }else{
                count=count-1;
            }
        }
        count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count>n/2){
           return candidate; 
        }
        return -1;
	}
}
