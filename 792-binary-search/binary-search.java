class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if( nums[mid]==target)//optimal majhire miligala
            return mid;
            if(nums[mid]<target)//if target ru left side element chota then left badhao
            {
                left=mid+1;
            }
            else
            right=mid-1;//if target ru right side bada the right side ku chota kara i.e kamao
        }
        return -1;
        
    }
}