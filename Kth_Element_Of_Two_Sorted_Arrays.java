public class Kth_Element_Of_Two_Sorted_Arrays{
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {

        int i = 0, j = 0;

      
        while (i < m && j < n) {
            if (i + j == k - 1) {
                return Math.min(row1[i], row2[j]);
            }

            if (row1[i] < row2[j]) {
                i++;
            } else {
                j++;
            }

        }

      
        while (i < m) {
            if (i + j == k - 1) {
                return row1[i];
            }

            i++;
        }

      
        while (j < n) {
            if (i + j == k - 1) {
                return row2[j];
            }

            j++;
        }

 
        return row2[i + j];
}
}
