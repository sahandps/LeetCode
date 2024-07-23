package Arrays101.Introduction;

class FindNumbersWithEvenNumberofDigits {

    public static void main(String[] args) {
        
    }

    public int findNumbers(int[] nums) {
        int res = 0;
        String number = "";
        for (int i = 0; i < nums.length; i++) {
            number = Integer.toString(nums[i]);
            if(number.length() % 2 == 0){
                res++;
            }
        }
        return res;
    }
}