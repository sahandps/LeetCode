package Arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int tempa = 0;

        if (nums1.length == 1 && nums2.length == 1) {
            nums1[0] = nums2[0];
        } else {
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[tempa];
                tempa++;
            }
        }
        Arrays.sort(nums1);
    }
}
