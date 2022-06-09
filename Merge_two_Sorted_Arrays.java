import java.util.* ;
import java.io.*; 
public class Merge_two_Sorted_Arrays{
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] temp=new int[m+n];
        int p1=m-1,p2=n-1,i=m+n-1;
        while (p2>=0){
            if (p1>=0 && arr1[p1]>arr2[p2]){
                arr1[i--]=arr1[p1--];
            }else{
                arr1[i--]=arr2[p2--];
            }
        }
        for (int j=0;j<temp.length;j++){
            temp[j]=arr1[j];
        }
        return temp;
    }
}