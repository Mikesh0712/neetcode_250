class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        int min=nums[0],max=nums[0];
        for(int x:nums){//to find the max ,min element and also store all the elements in the hashset
            min=Math.min(min,x);
            max=Math.max(max,x);
            set.add(x);       
             }
        for(int i=min+1;i<max;i++){//to find the the element not present in set we check from the minimum element to max element 
            if(!set.contains(i))
            list.add(i);
        }
       return list; 
    }
}