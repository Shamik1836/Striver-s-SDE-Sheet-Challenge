import java.util.*;
public class Print_String_Permuations  {
    static void helper(String s,String res,List<String> result){
        if (s.length()==0){
            result.add(res);
            return;
        }
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String chL=s.substring(0,i);
            String chR=s.substring(i+1);
            String rest=chL+chR;
            helper(rest,res+ch,result);
        }
    }
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> finalAns=new ArrayList<String>();
        helper(s,"",finalAns);
        return finalAns;
    }
}