package arrays101;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };

        removeElement(nums, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        int newArraySize = 0;
        int numbers = 0;
        boolean isOn = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }

        newArraySize = nums.length - counter;
        counter = 0;
        int[] temp = new int[newArraySize];

        while (isOn) {

            if (nums[counter] != val) {
                temp[numbers] = nums[counter];
                counter++;
                numbers++;
            } else {
                counter++;
            }

            if (counter == nums.length - 1) {
                isOn = false;
            }

        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        return temp.length;
    }

}
