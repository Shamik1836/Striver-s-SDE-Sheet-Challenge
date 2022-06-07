public class Sort_0_1_2_Array {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int lo=0,hi=arr.length-1,mid=0;
        int temp;
        while (mid<=hi){
            switch (arr[mid]){
                case 0:{
                    temp=arr[lo];
                    arr[lo]=arr[mid];
                    arr[mid]=temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[hi];
                    arr[hi]=arr[mid];
                    arr[mid]=temp;
                    hi--;
                    break;
                }
            }
        }
    }
    
}
