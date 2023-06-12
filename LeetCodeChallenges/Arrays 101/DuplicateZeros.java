public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int temp = 0;
        int temp2 = 0;
        int index = 0;
        int[] tempArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] == 0) {
                    temp = arr[i + 1];
                    tempArr[i + 1] = 0;
                } 
            }

            System.out.println(tempArr[i]);
        }

    }

}
