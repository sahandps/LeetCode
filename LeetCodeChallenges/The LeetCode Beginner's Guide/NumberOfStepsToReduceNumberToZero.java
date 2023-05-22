public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        numberOfSteps(14);
    }


    public static int numberOfSteps(int num) {
        int steps = 0;
        boolean isOn = true;
        while (isOn) {
            System.out.println("sahand");
            if (num != 0) {
                if (num % 2 != 0) {
                    num = num - 1;
                    steps++;
                    num = num / 2;
                }
            }
            if (num == 0) {
                isOn = false;
            }
        }
        System.out.println(steps);
        return steps;
    }
}

