class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[]=new int[m+n];
        for(int i=0;i<m;i++){
            num[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            num[m+i]=nums2[i];
        }
    Arrays.sort(num);
    for (int i = 0; i < m + n; i++) {
            nums1[i] = num[i];
        }

    }
}