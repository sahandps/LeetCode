package Inserting_Item_into_an_Array;

public class DuplicateZeros {

    public static void main(String[] args) {
<<<<<<< HEAD
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }


    public static void duplicateZeros(int[] arr) {
        int i = 0;
        int j = 1;
        int tempHolder = 0;


        while(i < arr.length){


            if(arr[i] == 0){
                for (int k = arr.length - 1; k > i; k--) {

                    arr[k] = arr[k - 1];

                }
                i++;
                arr[i] = 0;

            }
            i++;
        }
=======
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
>>>>>>> fa5415ad4a807e33c9eab48f78a80497812bbed9
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
