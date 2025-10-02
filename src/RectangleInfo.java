import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double length = 5.0;
        double width = 3.0;
        double area = 0.0;
        double perimeter = 0.0;
        double hypotenuse = 0.0;

        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the length:");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine(); //clear the newline
                if (length <= 0)
                {
                    System.out.println("Length must be greater than 0.");
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a valid number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the width:");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine(); //clear the newline
                if (width <= 0)
                {
                    System.out.println("Width must be greater than 0.");
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a valid number.");
            }
        } while (!done);

        area = length * width;
        perimeter = 2 * (length + width);
        hypotenuse = Math.sqrt(length * length + width * width);

        //double area = length * width;
        //double perimeter = 2 * (length + width);

        System.out.printf("For a rectangle with length %.2f and width %.2f:\n", length, width);
        System.out.printf("Area: %.2f", area);
        System.out.printf("Perimeter: %.2f", perimeter);
        System.out.printf("Hypotenuse: %.2f", hypotenuse);


    }
}
