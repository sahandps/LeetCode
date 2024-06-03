package Deleting_item_from_array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] temp = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(temp);
    }

    public static int removeDuplicates(int[] nums) {

        int uniqueIndex = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i -1]){
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;


    }

}
