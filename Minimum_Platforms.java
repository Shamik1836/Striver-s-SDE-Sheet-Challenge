 
import java.util.*;
public class Minimum_Platforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int plat=1,maxi=1;
        int i=1,j=0;
        while (i<n && j<n){
            if (at[i]<=dt[j]){
                plat++;
                i++;
            }
            else if(at[i]>dt[j]){
                plat--;
                j++;
            }
            if (plat>maxi)
                maxi=plat;
        }
        return maxi;
    }
}