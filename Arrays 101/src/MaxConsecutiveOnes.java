public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1, 0, 1 };
        findMaxConsecutiveOnes(nums);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == 1){
                counter++;
                if(counter > max){
                    max = counter;
                }
            }
            if(nums[i] ==  0){
                counter = 0;
            }
           
        }

        System.out.println(max);
        return max;

    }
}