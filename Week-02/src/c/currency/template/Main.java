package c.currency.template;

import java.util.Scanner;

/**
 * A solution for a currency converter program.
 * <p>
 * This class includes the main method which lets the user choose a conversion and then calculates the currency by
 * calling the respective method in the switch case block.
 * Look in the class Currency to see the calculation.
 *
 * @author CSE - Noor Mohammed & INSO - Johannes Hufnagl
 */

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int firstCurrency, secondCurrency, keepRunning, amount;
        ICurrency converter;

        do {
            System.out.println("Chose first currency");
            System.out.println("[1] Euro");
            System.out.println("[2] Dollar");
            System.out.println("[3] Rupee");
            System.out.println("[4] Yen");

            System.out.println("Enter your choice:");
            firstCurrency = s.nextInt();

            System.out.println("Chose second currency");
            System.out.println("[1] Euro");
            System.out.println("[2] Dollar");
            System.out.println("[3] Rupee");
            System.out.println("[4] Yen");

            System.out.println("Enter your choice:");
            secondCurrency = s.nextInt();

            System.out.println("Enter amount:");
            amount = s.nextInt();

            converter = null; // Rest converter

            switch (firstCurrency) {
                case 1 -> { // Euro
                    converter = new Euro(amount);
                }
                case 2 -> { // Dollar
                    converter = new Dollar(amount);
                }
                case 3 -> { // Rupee
                    // TODO: Implement Rupee conversation
                }
                case 4 -> { // Yen
                    converter = new Yen(amount);
                }
                default -> {
                    System.out.println("First Currency not found");
                }
            }

            if (converter != null) { // Check if the converter is null

                switch (secondCurrency) {
                    case 1 -> { // Euro
                        converter.toEuro();
                    }
                    case 2 -> { // Dollar
                        converter.toDollar();
                    }
                    case 3 -> { // Rupee
                        System.out.println("Not yet implemented!");
                        // TODO: call toRupee() here from the Rupee
                    }
                    case 4 -> { // Yen
                        converter.toYen();
                    }
                    default -> {
                        System.out.println("Second Currency not found");
                    }
                }
            } else {
                System.out.println("Converter was not set");
            }

            System.out.println("Enter 0 to quit and 1 to continue ");
            keepRunning = s.nextInt();
        } while (keepRunning == 1);
    }
}
