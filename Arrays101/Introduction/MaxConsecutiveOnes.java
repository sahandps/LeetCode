package Arrays101.Introduction;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] num = { 1, 1, 0, 1, 1, 1 };
        findMaxConsecutiveOnes(num);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int holder = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                holder++;
                if (holder > res) {
                    res = holder;
                }
            } else {
                holder = 0;
            }
        }
        return res;
    }
}