
import java.util.ArrayList;

public class Return_Subsets_Sum_to_K {
    public static void findSubsetsThatSumToKHelper(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curSubset, int k, int idx) {

        if (idx == arr.size()) {
            if (k == 0 && curSubset.size() != 0) {
                ans.add(curSubset);
            }
            return;
        }

        findSubsetsThatSumToKHelper(arr, ans, curSubset, k, idx + 1);

        ArrayList<Integer> curSubset1 = new ArrayList<>(curSubset);
                curSubset1.add(arr.get(idx));

        findSubsetsThatSumToKHelper(arr, ans, curSubset1, k - arr.get(idx), idx + 1);
    }

    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) {
 
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();


        ArrayList<Integer> curSubset = new ArrayList<>();

        findSubsetsThatSumToKHelper(arr, ans, curSubset, k, 0);

        return ans;
    }
}