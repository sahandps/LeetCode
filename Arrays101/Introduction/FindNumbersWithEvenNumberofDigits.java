package Arrays101.Introduction;

public class FindNumbersWithEvenNumberofDigits {
    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int resault = 0;
        String str = "";

        for (int i = 0; i < nums.length; i++) {
            str = String.valueOf(nums[i]);

            if (str.length() % 2 == 0) {
                resault++;
            }
        }

        return resault;
    }

}
