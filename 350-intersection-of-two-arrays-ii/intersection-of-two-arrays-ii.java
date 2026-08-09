class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>list=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j])//if both elements are same 
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])//to check if nums1 cuurent element is smaller then nums2 element
            {
                i++;
            }
            else 
            {
                j++;
            }
        }
        int ans[]=new int[list.size()];//to convert arraylist back to integer array
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
        return ans;
    }
}