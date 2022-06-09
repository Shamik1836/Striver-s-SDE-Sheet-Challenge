import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
// Here two pointers fast and slow are taken initially slow moves by one element and fast moves by two elems
// Now the point where they meet for the first time, fast is taken to the first element of the Array
// after that fast and slow again moves by one elem and the point where they meet for the second time is the duplkicate element
public class Find_Duplicate_Num_In_Array {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        // Here ArrayList is getting copnvereted to array
        Integer[] arrNums = new Integer[arr.size()];
        arrNums = arr.toArray(arrNums);
        int slow=arrNums[0];
        int fast=arrNums[0];
        do{
            slow=arrNums[slow];
            fast=arrNums[arrNums[fast]];
        }while (slow!=fast);
        fast=arrNums[0];
        while (slow!=fast){
            slow=arrNums[slow];
            fast=arrNums[fast];
        }
       return slow;
    }
}
