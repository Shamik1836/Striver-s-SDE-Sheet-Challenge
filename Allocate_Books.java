public class Allocate_Books {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {

        long sum = 0;
        
        int maxTime = Integer.MIN_VALUE;

        
        for (int i = 0; i < m; i++) {
            sum += time[i];
            maxTime = Math.max(maxTime , time[i]);
        }

       
        long l = maxTime, r = sum, answer = sum;
        while (l <= r) {
            
            long mid = (l + r) / 2;
            long days = 1;
            long currentTime = 0;
            for (int i = 0; i < m; i++) {
                currentTime += time[i];
                if (currentTime > mid) {
                    days++;
                    currentTime = time[i];
                }

            }

            
            if (days <= n) {
                answer = mid;
                r = mid - 1;
            }

            else {
                l = mid + 1;
            }

        }


        return answer;
    }

}