class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;//if k>n for eg k=10 n=7 for k=10 and k=3 same array after reversing
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    private void rev(int nums[],int left,int right){
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}