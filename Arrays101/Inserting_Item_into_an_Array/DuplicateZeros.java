package Inserting_Item_into_an_Array;

public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == 0) {
                for (int j = arr.length-1; i < j; j--) {
                    arr[j + 1] = arr[j];
                }
                i++;
                arr[i] = 0;
            }
            i++;
        }
    }

}
