public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        maximumWealth(accounts);
    }





    public static int maximumWealth(int[][] accounts) {
        int [] temp = new int[accounts.length];
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = accounts[i][j] + sum;
            }
            if (sum > temp[0]){
                temp[0] = sum;
            }
            sum = 0;
        }
        return temp[0];
    }
}
