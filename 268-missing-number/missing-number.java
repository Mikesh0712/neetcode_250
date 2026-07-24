class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)//to put the elements in the set for checking 
        {
            set.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!set.contains(i))//checking whether the number is present in set or not 
            return i;
        }
      return -1; 
    }
}