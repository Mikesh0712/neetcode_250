class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>first=new ArrayList<>();//1st row
        first.add(1);
        ans.add(first);

        for(int i=1;i<numRows;i++)
        {
            List<Integer>prev=ans.get(i-1);
            List<Integer>current=new ArrayList<>();
            current.add(1);//1st element is always 1
            for(int j=1;j<i;j++)//to calculate middle elements
            {
                int value=prev.get(j-1)+prev.get(j);
                current.add(value);
            }
            current.add(1);//last element also always 1
            ans.add(current);
        }
        return ans;
    }
}