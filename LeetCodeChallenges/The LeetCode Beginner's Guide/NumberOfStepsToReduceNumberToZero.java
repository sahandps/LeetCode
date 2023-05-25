public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        numberOfSteps(0);
    }



    public static int numberOfSteps(int num) {
        int steps = 0;
        boolean isOn = true;
        while (isOn) {
            if (num % 2 == 0 && num != 0) {
                num = num / 2;
                steps++;
            } else if (num % 2 != 0 && num != 0) {
                num = num - 1;
                steps++;
            }
            if (num == 0) {
                isOn = false;

            }
        }
        System.out.println(steps);
        return steps;
    }
}

