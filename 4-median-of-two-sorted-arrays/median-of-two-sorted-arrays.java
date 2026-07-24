class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ans[i+nums1.length]=nums2[i];
        }
        Arrays.sort(ans);
        if(ans.length%2!=0){
            return ans[ans.length/2];
        }
        int mid1=ans.length/2-1;
        int mid2=ans.length/2;
        return (ans[mid1]+ans[mid2])/2.0;
        
    }
}
