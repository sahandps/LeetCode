package Arrays101;

public class FindNumberswithEvenNumberofDigits {



    public int findNumbers(int[] nums) {
        int number = 0;
        String holder = "";

        for (int i = 0; i < nums.length; i++) {
            holder = Integer.toString(nums[i]);

            if(holder.length() % 2 == 0){
                number++;
            }
        }
        return number;
    }
}
