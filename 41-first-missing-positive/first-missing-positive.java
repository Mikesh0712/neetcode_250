class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int key=1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);}
        while(true){
            if(map.containsKey(key))
            key++;
            else
            break;
        }
        return key;
    }
}