package Arrays101.Introduction;

/**
 * MaxConsecutiveOnes
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = { 1,1,0,1,1,1 };
        findMaxConsecutiveOnes(nums);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                index++;
                for (int j = 1 + 1; j < nums.length; j++) {
                    if(nums[j] == 1){
                        index++;
                    }else{
                        break;
                    }
                }
            }

            if(index > res){
                res = index;
                index = 0;
            }
        }

        return res;
    }
}