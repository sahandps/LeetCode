package Searchin_oitem_from_array;

public class ValidMountainArray {
    public static void main(String[] args) {
        int [] arr = {1, 3 ,2};
        validMountainArray(arr);
    }

    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }

        int peak = 0;
        for (int i = 1; i < arr.length - 2; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i + 1]){
                peak = i;
                break;
            }
        }

        if(peak == 0 || peak == arr.length -1){
            return false;
        }


        for (int i = 1; i < peak; i++) {
            if(arr[i] <= arr[i -1]){
                return false;
            }
        }

        for (int j = peak + 1; j < arr.length - 1; j++) {
            if(arr[j] >= arr[j -1]){
                return false;
            }
        }


        return true;
    }
}
