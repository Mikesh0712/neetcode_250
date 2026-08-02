class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean[]vis=new boolean[nums.length];
        solve(nums,ds,ans,vis);
        return ans;
    }
    public void solve (int nums[],List<Integer>ds,List<List<Integer>>ans,boolean vis[]){
        //base case permutation complete heijaithiba hele 
        if(ds.size()==nums.length){
            ans.add(new ArrayList<> (ds));
            return;
        }
        //sabu element ku choose kara
        for(int i=0;i<nums.length;i++){
            if(vis[i])//check karile visited achi ki nai if visited then continue if not then store that value
            continue;
            vis[i]=true;
            ds.add(nums[i]);//store the non-visited value
            solve(nums,ds,ans,vis);//recursion to store the next element
            //to backtrack i.e wapas purba state ku asa
            ds.remove(ds.size()-1);
            vis[i]=false;
        }
    }
}