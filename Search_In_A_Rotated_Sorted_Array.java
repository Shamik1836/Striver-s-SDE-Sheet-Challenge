public class Search_In_A_Rotated_Sorted_Array {
    public static int search(int arr[], int key) {
        // Write your code here.
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low + (high-low)/2;
            if (arr[mid]==key) return mid;
            if (arr[low]<=arr[mid]){
                if (key>=arr[low] && key<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if (key>=arr[mid]&& key<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
