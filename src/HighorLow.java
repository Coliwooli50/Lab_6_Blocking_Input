import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int targetNum = 0;
        int guessNum = 0;

        targetNum = rand.nextInt(10) + 1; //1-10

        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter a number between 1 and 10:");
            if (in.hasNextInt())
            {
                guessNum = in.nextInt();
                in.nextLine(); //clear the newline

                if (guessNum < 1 || guessNum > 10)
                {
                    System.out.println("Number must be between 1 and 10.");
                }
                else if (guessNum < targetNum)
                {
                    System.out.println("Too low, Target is " + targetNum);
                    done = true;
                }
                else if (guessNum > targetNum)
                {
                    System.out.println("Too high, Target is " + targetNum);
                    done = true;
                }
                else
                {
                    System.out.println("You guessed it! The number was " + targetNum);
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "Please enter a valid number.");
            }
            done = false;

        }while(!done);

    }
}
