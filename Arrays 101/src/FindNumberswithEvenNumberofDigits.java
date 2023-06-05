public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        
    }


    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] / 10 < 100){
                counter++;
            }
            
        }
        return counter;
    }
}
