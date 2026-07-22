class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++)
        //2 pointers i check last unique element,j scan array if same do nothing and move j else increase i for next unique element
        {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;//to return index of last unique element
        } 
        
    }