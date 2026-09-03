class Solution {
    public int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            // Left side ka sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            // Right side ka sum
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            // Dono equal hain → middle index
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}