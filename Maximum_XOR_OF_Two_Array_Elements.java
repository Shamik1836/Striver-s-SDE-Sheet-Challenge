// Brute Force Approach

public class Maximum_XOR_OF_Two_Array_Elements 
 {

    public static int maximumXor(int[] A) {
        
        // Write your Code here
        int maxXor=0;
        for(int i=0;i<A.length;i++){
            for (int j=i+1;j<A.length;j++){
                int xor=A[i]^A[j];
                maxXor=Math.max(xor,maxXor);
            }
        }
        return maxXor;
    }
}
