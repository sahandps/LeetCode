import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {

    public static void main(String[] args) {

    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> game = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                game.add("FizzBuzz");
            } else if (i % 3 == 0) {
                game.add("Fizz");
            } else if (i % 5 == 0) {
                game.add("Buzz");
            } else {
                game.add(Integer.toString(i));
            }
        }
        return game;
    }

}
