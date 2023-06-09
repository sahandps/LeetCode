import java.lang.Math;
public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        findNumbers(nums);
    }

    public static int findNumbers(int[] nums) {
        int counter = 0;
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            number = (int) (Math.log10(nums[i]) + 1);
            if(number % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
