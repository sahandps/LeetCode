import java.util.Arrays;

public class TwoArraySum {
    public static void main(String[] args) {
        int [] nums = {3,1,2,10,1};
        sum(nums);
    }

    public static void sum (int[] arr) {
        int sum = 0;
        int [] replacement = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            replacement[i] = sum;
        }
        System.out.println(Arrays.toString(replacement));
    }
}