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
        return tempArr;

    }

}
