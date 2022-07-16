
import java.util.ArrayList;

public class Word_Break_2{
     
	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
    
        int length=s.length();
        ArrayList<String>[] result=new ArrayList[length];
        helper(0,length,result,dictionary,s);
        return result[0];
	}
    static ArrayList<String> helper(int position,int length,ArrayList<String>[] result,ArrayList<String> dictionary,String s){
        if (result[position] != null){
            return result[position];
        }
        ArrayList<String> posStr=new ArrayList<>();
        for (String w:dictionary){
            if (s.startsWith(w,position)){
                if (position+w.length()==length){
                    posStr.add(w);
                    continue;
                }
                ArrayList<String> temp=helper(position+w.length(),length,result,dictionary,s);
                for (String r:temp){
                    posStr.add(w+" "+r);
                }
            }
        }
        result[position]=posStr;
        return posStr;
    }
}