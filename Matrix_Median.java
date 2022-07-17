 
import java.util.ArrayList;

public class Matrix_Median
{
    static int countSmallerThanMid(ArrayList<Integer> row,int mid){
        int l=0,h=row.size()-1;
        while (l<=h){
            int md=(l+h)>>1;
            if (row.get(md)<=mid){
                l=md+1;
            }else{
                h=md-1;
            }
        }
        return l;
    }
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
        int low=1;
        int high=1000000007;
        int n=matrix.size();
        int m=matrix.get(0).size();
        while (low<=high){
            int mid=(low+high)>>1;
            int cnt=0;
            for (int i=0;i<n;i++){
                cnt += countSmallerThanMid(matrix.get(i),mid);
            }
            if (cnt<=(n*m)/2) low=mid+1;
            else high=mid-1;
        }
        return low;
	}
}