class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int []result=new int[k];
        
        for(int i=0;i<k;i++){
            int maxfreq=0,number=0;
            for(int key:map.keySet()){
                if (map.get(key) > maxfreq) {
                    maxfreq = map.get(key);
                    number = key;
                }
            }
            result[i]=number;
            map.remove(number);
        }
        return result;
        
        
    }
}