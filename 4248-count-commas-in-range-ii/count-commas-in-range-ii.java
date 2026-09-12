class Solution {
    public long countCommas(long n) {

        long ans = 0;

        long start = 1000;

        while (start <= n) {

            // Every number from start to n gets one extra comma
            ans += n - start + 1;

            start *= 1000;
        }

        return ans;
    }
}