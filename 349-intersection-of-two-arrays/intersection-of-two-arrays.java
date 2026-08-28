class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int num:nums1)//store elements of 1st array in a hashset 
        {set.add(num);}
        for(int num:nums2)//check through elements in num2 array
        {
            if(set.contains(num))
            result.add(num);
        }
        int ans[]=new int[result.size()];
        int i=0;
        for(int num:result)
        {
            ans[i]=num;
            i++;
        }
        return ans;
    }
}