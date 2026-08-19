class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]>list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=end)//to check if intervals overlap or not if yes then merge 
            {
                end=Math.max(end,intervals[i][1]);//imprtant this is how it is merged
            }
            else
            {
                //if not overlapping then go the prev interval
                list.add(new int[]{start,end});
                start=intervals[i][0];//to move to the next interval
                end=intervals[i][1];
            }
        }
        list.add(new int[]{start,end});//last interval ku store kara
        return list.toArray(new int[list.size()][]);  
    }
}