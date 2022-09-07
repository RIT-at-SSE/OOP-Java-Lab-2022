package Noor.week3a;

import java.util.Scanner;

public class FiveNumbers {

    public static void main(String args[]) {

        int[] numbers = new int[5]; // Array of the size 5 filled up with 0s
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

        MAIN_LOOP: while (true) { // Outer loop has a name to be accessible in nested code blocks

            int input;

            System.out.println();
            System.out.println();
            System.out.println("Please put in a number between 10 and 100 inclusive");
            try {
                input = Integer.parseInt(myScanner.next()); // Read the input and parse it to a String
            } catch (NumberFormatException e) { // If the user puts in anything else but an integer then a error message is shown
                System.out.println("Error: please only put in integer numbers, please try again.");
                continue;
            }

            if (input < 10 || input > 100) { // Input numbers must be between 10 and 100 inclusive
                System.out.println("Only numbers between 10 and 100 inclusive are allowed, please try again.");
                continue;
            }

            for (int i = 0; i < numbers.length; i++) {

                int number = numbers[i];

                if (number != 0 && number == input) { // Number was already set
                    System.out.println("This number already exists, please add another one.");
                    continue MAIN_LOOP; // Start from the top again
                } else {
                    if (number == 0) { // Number can be stored in the array
                        numbers[i] = input;
                        System.out.println(input + " was added.");
                        break; // Number was added break out of this loop
                    }
                }
            }

            System.out.println();
            System.out.println("All current numbers are:");
            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];
                if (number != 0) { // Only print already added numbers
                    System.out.println((i + 1) + ": " + number);
                }
            }

            if (numbers[4] != 0) { // Last number was set, end program
                System.out.println("Five numbers are complete, thank you and good bye.");
                break;
            }
        }

        myScanner.close(); // Closing the scanner again
    }
}
