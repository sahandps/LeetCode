package Inserting_Item_into_an_Array;


public class MergeSortedArray{

    public static void main(String[] args) {
        
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start merging from the end of both arrays
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
    
        // Merge elements until one of the arrays is exhausted
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    
        // If nums2 still has elements left, copy them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    
}