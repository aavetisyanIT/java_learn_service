import java.sql.SQLOutput;
import java.util.Random;

public class GuessIt {
    public static final int MAX_GUESSES = 3;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("random number is %d %n", randomNum);

        String userInput = null;
        int guessCount = 0;
        while(!"q".equals(userInput)) {
            guessCount++;
            userInput = System.console().readLine("Please, guess a number: ");
            if (userInput.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(userInput);
                if(guessedNum == randomNum) {
                    String tryWord = guessCount == 1 ? "try" : "tries";
                    System.out.printf("You guessed in %d %s %n", guessCount, tryWord);
                    System.out.printf("The random number was %d, You got it!%n", randomNum);
                    return;
                } else {
                    if (guessCount == MAX_GUESSES) {
                        System.out.printf("You have exceeded allowed number of guesses which is %d %n", MAX_GUESSES);
                        return;
                    }
                    System.out.println("Try again!");
                };
            }
        }


    }
}
