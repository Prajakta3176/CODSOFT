// TASK 1
import  java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // generate random number between in the given range
        int lowerBound = 1;
        int upperBound = 100;

        // to keep the random number in range
        int randomNumber = rd.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int attempts = 0;

        // limiting the number of attempts
        int maxAttempts = 4;

        boolean correctGuess = false;

        System.out.println("Guess the number between "+ lowerBound + " and "+ upperBound+".");
        System.out.println("you have "+maxAttempts+" attempts to guess!");

        while(attempts < maxAttempts)
        {
            System.out.println("Enter your guess: ");

            int userGuess = sc.nextInt();
            attempts++;

            if(userGuess < randomNumber)
            {
                if(attempts < maxAttempts)
                {
                    System.out.println("To low! Try again.");
                }
            }
            else if(userGuess > randomNumber)
            {
                if(attempts < maxAttempts)
                {
                    System.out.println("To high! Try again.");
                }
            }
            // when userGuess = randomNumber
            else
            {
                System.out.println("Congratulations! You guessed the correct number in "+ attempts +" attempts");
                correctGuess = true;
                break;
            }

            if(attempts < maxAttempts)
            {
                System.out.println("You have "+ (maxAttempts - attempts) + " attempts left.");
            }
        }

        // when attempts exceeds maxAttempts
        if(!correctGuess)
        {
            System.out.println("Sorry,You have used all the attempts. Correct number was "+ randomNumber + ".");
        }

        System.out.println("Do you want to play again ? (yes or no): " );
        // clear the buffer
        sc.nextLine();
        String playAgain = sc.nextLine();

        if(playAgain.equalsIgnoreCase("yes"))
        {
            // restart the game
            main(new String[]{});
        }
        else
        {
            System.out.println("Thankyou for playing !");
        }
    }
}
