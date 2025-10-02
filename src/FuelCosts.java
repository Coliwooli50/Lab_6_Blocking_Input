import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double tankSize = 0.0;
        double mpg = 0.0;
        double pricePerGal = 0.0;
        double miles100Cost = 0.0;
        double fullTankDistance = 0.0;

        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the miles per gallon:");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); //clear the newline

                if (mpg <= 0) {
                    System.out.println("MPG must be greater than 0.");
                } else {
                    done = true;
                }
            } else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "Please enter a valid number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the tank size in gallons:");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine(); //clear the newline

                if (tankSize <= 0) {
                    System.out.println("Tank size must be greater than 0.");
                } else {
                    done = true;
                }
            } else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "Please enter a valid number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the Price per gallon:");
            if (in.hasNextDouble()) {
                pricePerGal = in.nextDouble();
                in.nextLine(); //clear the newline

                if (pricePerGal <= 0) {
                    System.out.println("Price per gallon must be greater than 0.");
                } else {
                    done = true;
                }
            } else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "Please enter a valid number.");
            }
        } while (!done);

        miles100Cost = (100 / mpg) * pricePerGal;
        fullTankDistance = tankSize * mpg;

        System.out.printf("The cost per 100 miles is $%.2f\n", miles100Cost);
        System.out.printf("The distance that can be driven on a full tank is %.1f miles\n", fullTankDistance);
    }
}
