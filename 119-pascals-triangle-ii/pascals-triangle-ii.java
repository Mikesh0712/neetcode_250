class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>prev=new ArrayList<>();
        prev.add(1);//1st row
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer>current=new ArrayList<>();
            current.add(1);//1st element is always 1
            for(int j=1;j<i;j++)//to calculate middle elements
            {
                int value=prev.get(j-1)+prev.get(j);
                current.add(value);
            }
            current.add(1);//last element also always 1
            prev=current;//current row heijiba previous row
        }
        return prev;
        
    }
}