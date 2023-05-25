public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        findMaxConsecutiveOnes(nums);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0 && nums[i + 1] + nums[i + 2] == 2 || nums[i] == 1 && nums[i +1] == 1){
                counter = counter + 1;
            }
            if(i == nums.length-2){
                break;
            }

        }
        System.out.println(counter);
        return counter - 1;
    }
}