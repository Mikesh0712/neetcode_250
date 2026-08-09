class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int num:nums)//to find the frequency of all elements
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet())//to check for the frequency where frequency more than 1 are duplicates 
        {
            if(map.get(num)>1)
            list.add(num);
        }
        return list;
    }
}