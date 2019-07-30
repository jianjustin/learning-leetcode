public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];

        int a = 0 , b = 0;
        for (int i = 0; i < nums3.length; i++){
            if(a >= m)
                nums3[i] = nums2[b++];
            else if(b >= n)
                nums3[i] = nums1[a++];
            else
                nums3[i] = nums1[a] < nums2[b] ? nums1[a++] : nums2[b++];
        }

        for (int i = 0; i < nums3.length; i++)
            nums1[i] = nums3[i];
    }

}
