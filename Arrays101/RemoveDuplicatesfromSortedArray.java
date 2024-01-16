package Arrays101;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] temp = { 1, 1, 2,2,3,3,4,4,4 };
        removeDuplicates(temp);
    }

    public static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length -1];

        return j;
    }
}
