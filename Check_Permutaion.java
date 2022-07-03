
import java.util.*;
public class Check_Permutaion {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for (Character ch:str1.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for (Character ch:str2.toCharArray()){
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        return h1.equals(h2);
    }
}