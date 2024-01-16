public class numberOfStepsToZero {
    public static void main(String[] args) {
        numberOfSteps(14);
    }

    public static int numberOfSteps(int num) {
        int counter = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num = num - 1;
                counter++;
            }
            if (num == 0) {
                break;
            }
            counter++;
            num = num / 2;
        }
        return counter;
    }
}
