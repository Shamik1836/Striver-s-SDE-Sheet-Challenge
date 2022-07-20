public class Longest_Common_Prefix{
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
        if (n==0) return "";
        String prefix=arr[0];
        for (int i=1;i<arr.length;i++){
            while (arr[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
	}

}
