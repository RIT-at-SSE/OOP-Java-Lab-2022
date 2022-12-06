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
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int choice, ch;
        Dollar dollar = new Dollar();
        Euro euro = new Euro();
        Yen yen = new Yen();
        Rupee rupee = new Rupee();

        do {
            System.out.println("1.Dollar to Rupee ");
            System.out.println("2.Dollar to Euro ");
            System.out.println("3.Dollar to Yen ");
            System.out.println("4.Euro to Rupee ");
            System.out.println("5.Euro to Dollar ");
            System.out.println("6.Euro to Yen ");
            System.out.println("7.Rupee to Dollar ");
            System.out.println("8.Rupee to Euro ");
            System.out.println("9.Rupee to Yen ");
            System.out.println("10.Yen to Rupee ");
            System.out.println("11.Yen to Dollar ");
            System.out.println("12.Yen to Euro ");

            System.out.println("Enter your choice");
            choice = s.nextInt();
            switch (choice) {
                case 1: {
                    dollar.toRupee();
                    break;
                }
                case 2: {
                    dollar.toEuro();
                    break;
                }
                case 3: {
                    dollar.toYen();
                    break;
                }
                case 4: {
                    euro.toRupee();
                    break;
                }
                case 5: {
                    euro.toDollar();
                    break;
                }
                case 6: {
                    euro.toYen();
                    break;
                }
                case 7: {
                    // TODO: implement methods in Rupee class
                    // rupee.toDollar();
                    break;
                }
                case 8: {
                    // TODO: implement methods in Rupee class
                    // rupee.toEuro();
                    break;
                }
                case 9: {
                    // TODO: implement methods in Rupee class
                    // rupee.toYen();
                    break;
                }
                case 10: {
                    yen.toRupee();
                    break;
                }
                case 11: {
                    yen.toDollar();
                    break;
                }
                case 12: {
                    yen.toEuro();
                    break;
                }
                default:
                    break;
            }
            System.out.println("Enter 0 to quit and 1 to continue ");
            ch = s.nextInt();
        } while (ch == 1);
    }
}
