package arrays101;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] num = { 1, 1, 2 };
        removeDuplicates(num);
    }

    public static  int [] removeDuplicates(int[] nums) {
        int count = 1;
        int currNum = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(currNum != nums[i]){
                nums[count] = nums[i];
                currNum = nums[i];
                count++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

        return nums;

    }
}
