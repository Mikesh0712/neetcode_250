class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //      if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))//check does the set contain that element if yes true otherwise add that to the set that respective element
            return true;

            set.add(nums[i]);
        }
        return false;
        
    }
}