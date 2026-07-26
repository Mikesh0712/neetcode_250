class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Pure array ko check karo
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                // Pehli baar mila
                if (ans[0] == -1) {
                    ans[0] = i;
                }
                // Last occurrence update karte raho
                ans[1] = i;
            }
        }
        return ans;
    }
}