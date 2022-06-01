import java.sql.SQLOutput;
import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        String userInput = null;
        while(!"q".equals(userInput)) {
            userInput = System.console().readLine("Please, guess a number: ");
            if (userInput.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(userInput);
                if(guessedNum == randomNum) {
                    System.out.printf("The random number was %d, You got it!%n", randomNum);
                    return;
                } else {
                    System.out.println("Try again!");
                }
                ;
            }
        }

    }
}
