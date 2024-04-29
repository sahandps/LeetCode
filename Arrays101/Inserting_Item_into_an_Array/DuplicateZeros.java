package Inserting_Item_into_an_Array;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println("Hiiii");
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Shift elements to the right
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // Place another zero after the current one
                if (i < arr.length - 1) {
                    arr[++i] = 0;
                }
            }
        }
    }
    
}
