public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 2, 3 };

        removeElement(arr, 3);
    }

    public static void removeElement(int[] nums, int val) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            }
        }
        int length = nums.length - counter;
        int[] arr = new int[length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                arr[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
