class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            // Current character count badhao
            count[s.charAt(right) - 'A']++;
            // Window me maximum frequency update karo
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);
            // Agar replacements zyada ho gaye
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            // Maximum answer update karo
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}