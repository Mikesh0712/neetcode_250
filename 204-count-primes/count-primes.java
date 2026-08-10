class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        // Initially sabu number prime dhariba
        Arrays.fill(prime, true);
        // 0 and 1 prime nuhanti
        if (n > 0) prime[0] = false;
        if (n > 1) prime[1] = false;
        // Check each number
        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                // i ra multiples ku non-prime mark kara
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        // Count primes
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i])
                count++;
        }
        return count;
    }
}