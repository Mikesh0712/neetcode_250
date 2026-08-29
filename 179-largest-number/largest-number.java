class Solution {
    public String largestNumber(int[] nums) {
        String[]arr=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }
        //logic to find number to be at first 
        Arrays.sort(arr, (a, b) -> {
        return (b+a).compareTo(a+b);//the combination which is larger is kept 1st
        });
        //join all the combinations
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }
        if(result.charAt(0)=='0')
        return "0";

        return result.toString();
    }
}