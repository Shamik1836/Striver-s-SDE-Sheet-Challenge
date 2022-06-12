import java.util.* ;
import java.io.*; 
public class Longest_Consecutive_Sequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Set<Integer> hSet=new HashSet<Integer>();
        for (int num:arr){
            hSet.add(num);
        }
        int longestStreak=0;
        for (int num:arr){
            if (!hSet.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while (hSet.contains(currNum+1)){
                    currNum+=1;
                    currStreak+=1;
                }
                longestStreak=Math.max(currStreak,longestStreak);
            }
        }
        return longestStreak;
    }
}
