import java.util.* ;
import java.io.*; 
public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
       if (n==0){
           return 1;
       }
       long answer=modularExponentiation(x,n/2,m);
       if (n%2==0){
           return (int) ((answer*answer)%m);
       }
       else{
           return (int) (((answer*answer)%m*x%m)%m);
       }
    }
}
