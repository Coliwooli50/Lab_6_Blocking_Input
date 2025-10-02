import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double celsius = 0.0;
        double fahrenheit = 0.0; //(celsius * 9/5) + 32
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter a temperature in Celsius:");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); //clear the newline
                done = true;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.1f Celsius is %.1f Fahrenheit", celsius, fahrenheit);
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "Please enter a valid number.");
            }
        }while(!done);
        {

        }

    }
}
