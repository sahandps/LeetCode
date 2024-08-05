public class duplicateZero {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = arr.length -1; i > 0 ; i--) {
            if(arr[i] == 0){
                for(int k = arr.length -1; k > i; k--) {
                    arr[k] = arr[k - 1];
                }
            }
        }
    }
}
