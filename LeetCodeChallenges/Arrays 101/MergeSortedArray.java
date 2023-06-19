public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;

        int[] num2 = { 2, 5, 6 };
        int n = 3;

        merge(num1, m, num2, n);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArr = new int[m + n];
        int index = 0;
        int counter = 0;
        boolean isOn = true;
        while (isOn) {
            if (nums1[counter] != 0) {
                tempArr[index] = nums1[counter];
                index++;
            }
            if (nums2[counter] != 0) {
                tempArr[index] = nums2[counter];
                index++;
            }
            counter++;
            if (index == tempArr.length) {
                isOn = false;
            }
        }
        sort(tempArr);
    }
}