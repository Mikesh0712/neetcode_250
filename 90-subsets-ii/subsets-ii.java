class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Duplicate ekathi aniba pain sort kara
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        // Empty subset ru start
        ans.add(new ArrayList<>());
        int start = 0, end = 0;
        // Sabu element ku traverse kara
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            // Duplicate hele kebala previous iteration re
            // add heithiba subsets ru start kara
            if (i > 0 && nums[i] == nums[i - 1])
                start = end + 1;

            // Current size store kara
            end = ans.size() - 1;

            // Required subsets re current number add kara
            for (int j = start; j <= end; j++) {
                List<Integer> temp = new ArrayList<>(ans.get(j));
                // Current number add kara
                temp.add(nums[i]);
                // New subset store kara
                ans.add(temp);
            }
        }
        return ans;
    }
}