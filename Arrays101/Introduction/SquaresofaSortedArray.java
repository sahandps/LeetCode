package Introduction;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }
}
