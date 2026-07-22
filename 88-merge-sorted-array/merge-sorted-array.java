class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[]=new int[m+n];//aga bada array banao
        for(int i=0;i<m;i++){//add kara bada array re 1st array elements
            num[i]=nums1[i];
        }
        for(int i=0;i<n;i++)//add kara bada array re second array elements
        {
            num[m+i]=nums2[i];//as m jagah jaen jai sarichi so m+i to start from next next jagah eg 1,2,3 done to start from 4 
        }
    Arrays.sort(num);
    for (int i = 0; i < m + n; i++) {//copy bada array to nums1 array
            nums1[i] = num[i];
        }

    }
}