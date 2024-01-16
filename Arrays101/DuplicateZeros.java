package Arrays101;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int i = 0;
        int temp = 0;

        while (i < arr.length) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];

                    if (j == i + 1) {
                        arr[j] = 0;
                    }
                }
                i++;
            }
            i++;
        }
    }
}
