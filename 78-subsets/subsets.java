class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        //empty susbet ru start kara
        ans.add(new ArrayList<>());
        for(int num:nums){
            int size=ans.size();
            //puruna subset re number add kara
            for(int i=0;i<size;i++){
                List<Integer>temp=new ArrayList<>(ans.get(i));
                temp.add(num);
                ans.add(temp);
            }
        }
        return ans;
    }
}