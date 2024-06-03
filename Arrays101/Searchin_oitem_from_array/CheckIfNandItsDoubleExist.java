package Searchin_oitem_from_array;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int [] arr = {7,1,14,11};

        checkIfExist(arr);
    }



    public static boolean checkIfExist(int[] arr) {
        int i = 0;

        while(i < arr.length){

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] * 2){
                    return true;
                }
            }

            i++;
        }

        return false;
    }

}
