package c.currency.solutions.solution1;

import java.util.Scanner;

/**
 * A solution for a currency converter program.
 * <p>
 * This class includes the main method which lets the user choose a conversion and then calculates the currency by
 * calling the respective method in the switch case block.
 * Look in the class Currency to see the calculation.
 *
 * @author CSE - Noor Mohammed
 */

class Converter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int choice, ch;
        Currency c = new Currency();

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
                    c.rupeeToDollar();
                    break;
                }
                case 3: {
                    c.euroToRupee();
                    break;
                }
                case 4: {
                    c.rupeeToEuro();
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
                default: {
                    break;
                }
            }
            System.out.println("Enter 0 to  quit and 1 to continue ");
            ch = s.nextInt();
        } while (ch == 1);
    }
}