public class Implement_aToI {
    public static int atoi(String str) {
        // Write your code here.
        int res=0;
        int sign=1;
        if (str.charAt(0)=='-'){
            sign=-1;
        }
        for (int i=0;i<str.length();i++){
            if((str.charAt(i)-'0')<=9 && (str.charAt(i)-'0')>=0){
                res =res*10+str.charAt(i)-'0';
            }
        }
        return res*sign;
    }
}
