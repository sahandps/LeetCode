public class sumOf1DArray {

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        maximumWealth(accounts);
    }

    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        int i = 0, j = 0;

        while (i < accounts.length) {

            int pointer = 0;

            for (j = 0; j < accounts[i].length; j++) {
                pointer = accounts[i][j] + pointer;
            }
            if (pointer > richest) {
                richest = pointer;
            }

            if (i < accounts.length) {
                i++;
            }
        }
        return richest;

    }
}