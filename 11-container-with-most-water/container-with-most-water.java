class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int store=0;
        while(left<right)
        {
            int h = Math.min(height[left], height[right]);
            int width=right-left;//difference between the walls in x-axis
            int area=h*width;//area of water stored as it is a rectangle
            store=Math.max(area,store);
            if(height[left]<height[right])//to move the wall which is small
            left++;
            else
            right--;
        }
       return store; 
    }
}