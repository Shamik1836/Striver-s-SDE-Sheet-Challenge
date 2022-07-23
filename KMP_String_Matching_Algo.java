public class KMP_String_Matching_Algo {
    private static void getlps(String str,int[] lps){
        int n=str.length(),len=0;
        lps[0]=0;
        int i=1;
        while (i<n){
            if (str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if (len==0){lps[i]=0;i++;}
                else{len=lps[len-1];}
            }
        }
    }
    public static boolean findPattern(String p, String s) {
        // Write your code here.
         int m = p.length();
        int n = s.length();
        int[] lps = new int[m];

        for (int i = 0; i < m; i++) {
            lps[i] = 0;
        }

        getlps(p, lps);

        int index1 = 0;
        int index2 = 0;

        while (index1 < n) {

            if (s.charAt(index1) == p.charAt(index2)) {

                index2++;
                index1++;

                if (index2 == m) {
                    return true;
                }

                if (index1 == n) {
                    return false;
                }

            }
            else {
                if (index2 == 0) {
                    index1 += 1;
                }
                else {
                  
                    index2 = lps[index2 - 1];
                }
            }
        }

        return false;
    }
}