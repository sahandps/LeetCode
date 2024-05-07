package Deleting_item_from_array;
public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};

        removeElement(nums, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }

        while(count < nums.length){
            nums[count++] = val;
        }


        return count;
    }

   

}