class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int key = nums[i];//current element dekho
            int j = i-1;//prev element dekho
            while(j>=0 && nums[j] > key){//check karo kya mera prev element mera current key se bada hai if haan then right move kardo woh prev element 
            nums[j+1] = nums[j];//shift karo element right
            j--;
    }
    nums[j+1] = key;// insert karo the key value (saved value)
        }
        return nums;  
    }
}