class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int longest=0;
        // Check every number
        for (int num : set)  {//always do search in set so that duplicate elements are ignored as if done in array duplicate elements will be there causing time limit exceeding
            // Is this the start of a sequence?
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;
                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
        
    }
}