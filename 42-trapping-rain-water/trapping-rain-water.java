class Solution {
    public int trap(int[] height) {
        // int water=0;
        // for(int i=0;i<height.length;i++){
        //     int leftmax=0,rightmax=0;
        //     for(int j=0;j<=i;j++){
        //         leftmax=Math.max(height[j],leftmax);
        //     }
        //     for(int k=i+1;k<height.length;k++){
        //         rightmax=Math.max(height[k],rightmax);
        //     }
        //     water+=Math.max(0,Math.min(rightmax,leftmax)-height[i]);        
        //     }
        // return water;


        int water=0;
        int left=0,right=height.length-1,leftmax=0,rightmax=0;
        while(left<right){
            if(height[left]<=height[right]){
                leftmax=Math.max(leftmax,height[left]);
                water+=leftmax-height[left];
                left++;
            }
            else{
                rightmax=Math.max(rightmax,height[right]);
                water+=rightmax-height[right];
                right--;
            }
            
        }
        return water;
    }
}