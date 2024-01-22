package Arrays101;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int test [] = {7,1,14,11};
        checkIfExist(test);
    }

    public static boolean checkIfExist(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == 2 * arr[j]){
                    result = true;
                }
            }
        }
        return result;
    }

}
