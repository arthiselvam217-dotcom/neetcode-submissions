class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]arthi=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                arthi[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                arthi[k]=nums2[j];
                j++;
                k++;

            }
        }
        while(i<nums1.length)
        {
            arthi[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            arthi[k]=nums2[j];
            j++;
            k++;
        }
        int n=arthi.length;
        if(n%2==1)
        {
            return arthi[n/2];
        }
        else
        {
            return (arthi[n/2]+arthi[n/2-1])/2.0;
        }
        
    }
}
