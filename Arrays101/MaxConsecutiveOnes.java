package Arrays101;

class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] temp = {1,1,0,2,1,1,1};

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int holder = 0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                counter++;
                if(counter > holder){
                    holder = counter;
                }
            }else{
                counter = 0;
            }
            
        }
        return holder;
    }

}