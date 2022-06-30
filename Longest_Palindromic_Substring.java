public class Longest_Palindromic_Substring {	
	public static String longestPalinSubstring(String str) {
		// Write your code here.
        int n=str.length();
        if (n < 1) {
            return "";
        }
        int start=0,end=0;
        for (int i=0;i<str.length();i++){
            int odd=expand(str,i,i);
            int even=expand(str,i,i+1);
            
            int len=Math.max(odd,even);
            if (len>end-start+1){
                start=i-(len-1)/2;
                end=i+len/2;            }
        }
        return str.substring(start,end+1);
	}
    static int expand(String s,int left,int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
