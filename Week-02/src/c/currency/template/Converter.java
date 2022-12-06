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

class Converter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int choice, ch;
        CurrencyNoor c = new CurrencyNoor();

        do {
            System.out.println("1.dollar to rupee ");
            System.out.println("2.rupee to dollar ");
            System.out.println("3.Euro to rupee ");
            System.out.println("4..rupee to Euro ");
            System.out.println("5.Yen to rupee ");
            System.out.println("6.Rupee to Yen ");

            System.out.println("Enter ur choice");
            choice = s.nextInt();
            switch (choice) {
                case 1: {
                    c.dollarToRupee();
                    break;
                }
                case 2: {
                    // TODO: Call the right method for the second choice, as it is done for case 1
                    break;
                }
                case 3: {
                    // TODO: Call the right method for the third choice, as it is done for case 1
                    break;
                }
                case 4: {
                    // TODO: Call the right method for the fourth choice, as it is done for case 1
                    break;
                }
                case 5: {
                    c.yenToRupee();
                    break;
                }
                case 6: {
                    c.rupeeToYen();
                    break;
                }
            }
            System.out.println("Enter 0 to  quit and 1 to continue ");
            ch = s.nextInt();
        } while (ch == 1);
    }
}