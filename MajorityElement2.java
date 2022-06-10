import java.util.*;
public class MajorityElement2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int num1=0,num2=0,count1=0,count2=0,n=arr.size();
        for (int i=0;i<n;i++){
            if (arr.get(i)==num1){
                count1++;
            }else if (arr.get(i)==num2){
                count2++;
            }else if (count1==0){
                num1=arr.get(i);
                count1=1;
            }else if (count2==0){
                num2=arr.get(i);
                count2=1;
            }else{
                count1--;count2--;
            }
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        count1=0;
        count2=0;
        for (int i=0;i<n;i++){
            if (arr.get(i)==num1)
                count1++;
            else if (arr.get(i)==num2)
                count2++;
        }
        if (count1>n/3)
            ans.add(num1);
        if (count2>n/3)
            ans.add(num2);
        return ans;
    }
}
