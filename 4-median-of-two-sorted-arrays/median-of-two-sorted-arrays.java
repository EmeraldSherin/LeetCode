class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                num[k++]=nums1[i++];
            }else{
                num[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            num[k++]=nums1[i++];
        }
        while(j<nums2.length){
            num[k++]=nums2[j++];
        }
        int n=num.length;
        double median=0;
        if(n%2==0){
            median=(num[n/2]+num[n/2-1])/2.0;
        }else{
            median=(num[n/2])/1.0;
        }
        return median;
    }
}