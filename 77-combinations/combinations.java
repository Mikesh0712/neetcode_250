class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(1,n,k,list,ans);
        return ans;
    }

    public void solve(int start,int n,int k,List<Integer>list,List<List<Integer>>ans)
    {
        if(list.size()==k)//k numbers miligala hele
        {
            ans.add(new ArrayList<>(list));
            return;        
        }
        for(int i=start;i<=n;i++)//start ru end till try kara
        {
            list.add(i);//number ku add kara in the list
            solve(i+1,n,k,list,ans);//choose next number
            list.remove(list.size()-1);//backtracking paen 
        }
    }
}