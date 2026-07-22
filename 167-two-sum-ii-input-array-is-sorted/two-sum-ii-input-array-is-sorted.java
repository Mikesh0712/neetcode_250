class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)//normal two pointers and return index with +1 as it is 1 based indexong
            {
                return new int[]{i+1,j+1};
            }
            if(numbers[i]+numbers[j]<target)//move i to increase sum
            i++;
            else//decrease j to decrease sum
            j--;
        }
       return new int[]{-1, -1}; 
    }
}