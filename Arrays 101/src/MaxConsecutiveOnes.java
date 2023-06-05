public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConsecutiveOnes(nums);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if(num[i - 1] == 1 && nums[i] == 1){
                counter++;
        }

    }
        System.out.println(counter);
        return counter;
}
}