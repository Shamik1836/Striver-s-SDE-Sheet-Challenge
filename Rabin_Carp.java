
import java.util.ArrayList;

public class Rabin_Carp {
	public static ArrayList<Integer> stringMatch(String str, String pat) {
		// Write your code here.
     
        int m=pat.length();
        int n=str.length();
        int prime = 31;
        int mod = 998244353;
        ArrayList<Long> primePower = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            primePower.add((long) 0);
        }

        primePower.set(0, (long) 1);
        for (int i = 1; i < n; i++) {
            primePower.set(i, (primePower.get(i - 1) * prime) % mod);
        }
        ArrayList<Long> h = new ArrayList<Long>();
        for (int i = 0; i < n + 1; i++) {
            h.add((long) 0);
        }

        for (int i = 0; i < n; i++) {
            h.set(i + 1, (h.get(i) + (str.charAt(i) - 'A' + 1) * primePower.get(i)) % mod);
        }
        long hashPattern = 0;
        for (int i = 0; i < m; i++) {
            hashPattern = (hashPattern + (pat.charAt(i) - 'A' + 1) * primePower.get(i)) % mod;
        }

        ArrayList<Integer> occurences = new ArrayList<Integer>();

        // Rolling hash
        for (int i = 0; i + m - 1 < n; i++) {
            long currentHash = (h.get(i + m) + mod - h.get(i)) % mod;

            // If a match is found, insert it in our answer
            if (currentHash == hashPattern * primePower.get(i) % mod) {
                occurences.add(i);
            }
        }

        return occurences;
}
}