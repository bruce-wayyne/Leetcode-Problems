class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int pcount = -1;
        int previous = -1;
        int current = -1;
        int median = (nums1.length + nums2.length) / 2;
        while (i < nums1.length || j < nums2.length) {
            previous = current;
            if (i >= nums1.length) {
                current = nums2[j];
                j++;
            } else if(j >= nums2.length) {
                current = nums1[i];
                i++;
            } else {
                if (nums1[i] < nums2[j]) { 
                    current = nums1[i];
                    i++;
                } else {
                    current = nums2[j];
                    j++;
                }
            }
            ++pcount;
            if (pcount == median) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (double)(current + previous) / 2;
                } else {
                    return current;
                }
            }
        }
        return 0;
    }
}