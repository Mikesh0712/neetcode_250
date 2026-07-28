class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // if se number asi sarichi 
            if (map.containsKey(nums[i])) {
                // Current index - previous index check karo
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Latest index update karo
            map.put(nums[i], i);
        }
        return false;
    }
}