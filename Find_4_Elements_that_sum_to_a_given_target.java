
import java.util.* ;
import java.io.*; 
public class Find_4_Elements_that_sum_to_a_given_target{
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
      if (arr==null || arr.length==0)
          return "No";
      Arrays.sort(arr);
      for (int i=0;i<n;i++){
          for (int j=i+1;j<n;j++){
              int target_2=target-arr[i]-arr[j];
              int front=j+1;
              int back=n-1;
              while (front<back){
                  int two_sum=arr[front]+arr[back];
                  if (two_sum<target_2) front++;
                  else if (two_sum>target_2) back--;
                  else{
                      ArrayList<Integer> quad=new ArrayList<>();
                      quad.add(arr[i]);
                      quad.add(arr[j]);
                      quad.add(arr[front]);
                      quad.add(arr[back]);
                      res.add(quad);
                      while (front<back && arr[front]==quad.get(2)) ++front;
                      while (front<back && arr[back]==quad.get(3)) --back;
                  }
              }
              while (j+1<n && arr[j+1]==arr[j]) ++j;
          }
          while (i+1<n && arr[i+1]==arr[i]) ++i;
      }
      if (res.size() != 0){
          return "Yes";
      }else{
          return "No";
      }
  }
}
