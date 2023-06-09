public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {
        int temp;
        int[] tempArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i] * nums[i];
            tempArr[i] = temp;
            System.out.println(tempArr[i]);
        }
        
        return sortingStuff(tempArr);
    }

    public static int[] sortingStuff(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

        
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

}
