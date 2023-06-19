public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 0 && i < arr.length - 1){
                temp = i;
                rotateToTheRigh(arr, temp);
                arr[i] = 0;
            }

        }

    }

    public static void rotateToTheRigh(int[] arr, int n) {
        for (int j = arr.length - 1; j > n; j--) {
            arr[j] = arr[j - 1];
        }
    }
}
