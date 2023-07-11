package arrays101;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = { -2,0,10,-19,4,6,-8};
        checkIfExist(arr);
    }

    public static boolean checkIfExist(int[] arr) {

        boolean status = false;

        for (int i = 0; i < arr.length; i++) {
            if(status == true){
                break;
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] * 2 == arr[j] || arr[j] * 2 == arr[i]) {
                    status = true;
                    break;
                } else {
                    status = false;
                }
            }

        }
        System.out.println(status);
        return status;

    }

}
