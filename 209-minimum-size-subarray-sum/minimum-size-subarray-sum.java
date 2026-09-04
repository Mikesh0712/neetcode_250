class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            // Right wala element add karo
            sum += nums[right];
            // Sum target tak pahunch gaya
            while (sum >= target) {

                // Current subarray ki length
                int length = right - left + 1;

                // Minimum length store karo
                min = Math.min(min, length);

                // Left wala element hatao
                sum -= nums[left];
                left++;
            }
        }

        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}