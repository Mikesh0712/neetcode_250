class Solution {
    public int removeDuplicates(int[] nums) {
    if(nums.length<=2)
    return nums.length;

    int k=1,count=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1])//if same element then count badhao 
        count++;
        else count=1;//if nua element then count reset to 1
        if(count<=2){//maximum 2 thara hi allowed
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
    }
}