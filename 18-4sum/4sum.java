class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // Duplicate i element skip karo (fix 1st element)
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            //duplicate j element skip karo(fix second element)
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1])
                continue;
            
            int left = j+1;
            int right = nums.length - 1;
            while (left < right) {
                //to avoid overflow
                long sum =(long) nums[i] + nums[left] + nums[right]+nums[j];;
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i],nums[j], nums[left], nums[right]));
                    left++;
                    right--;
                    // Left duplicates skip karo
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    // Right duplicates skip karo
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            }
        }
        return ans;
    }
}