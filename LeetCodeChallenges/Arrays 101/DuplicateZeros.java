public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == 0){
                arr[i] = 0;
            }

            System.out.println(arr[i]);
        }

    }

}
