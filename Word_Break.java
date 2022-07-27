
import java.util.*;
public class Word_Break {
    static int[] dp=new int[101];
    private static int help(int i,String target,HashSet<String> wordDict){
        if (i==target.length()) return 1;
        String temp="";
        if (dp[i] != -1) return dp[i];
        for (int j=i;j<target.length();j++){
            temp+=target.charAt(j);
            if (wordDict.contains(temp)){
                if (help(j+1,target,wordDict)==1) return dp[i]=1;
            }
        }
        return dp[i]=0;
    }
    public static Boolean wordBreak(String[] arr, int n, String target) {
        // Write your code here.
        HashSet<String> wordDict=new HashSet<>();
        for (String s:arr){
            wordDict.add(s);
        }
        Arrays.fill(dp,-1);
       if( help(0,target,wordDict)==1){
           return true;
       }else{
           return false;
       }
    }
}