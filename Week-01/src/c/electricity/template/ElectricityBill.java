package c.electricity.template;

import java.util.Scanner;

/**
 * A template for the electricity bill program.
 *
 * The methods from the CustomerData class are not yet used in order to get the data, calculate and show the bill.
 * Furthermore, there is still some parts missing in the display method which should be fixed.
 *
 * @author CSE - Noor Mohammed & INSO - Johannes Hufnagl
 */
class ElectricityBill {
    public static void main(String args[]) {
        CustomerData ob = new CustomerData();

        // TODO: Use the methods available in the class CustomerData, to get the data
        //       then calculate the bill and last but not least display the bill
    }
}

class CustomerData {
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    String cname, type;
    int bn;
    double current, previous, tbill, units;

    void getData() {
        System.out.print("\n\t Enter consumer number  ");
        bn = in.nextInt();
        System.out.print("\n\t Enter Type of connection  (D for Domestic or C for Commercial) ");
        type = ins.nextLine();
        System.out.print("\n\t Enter consumer name  ");
        cname = ins.nextLine();
        System.out.print("\n\t Enter previous month reading  ");
        previous = in.nextDouble();
        System.out.print("\n\t Enter current month reading  ");
        current = in.nextDouble();
    }

    void calc() {
        // TODO: You need to calculate the units used by the customer by subtracting the current month's reading
        //       minus the previous month`s reading
        // units = ??? - ???;
        if (type.equals("D")) {
            if (units <= 100)
                tbill = 1 * units;
            else if (units > 100 && units <= 200)
                tbill = 2.50 * units;
            else if (units > 200 && units <= 500)
                tbill = 4 * units;
            else
                tbill = 6 * units;
        } else {
            if (units <= 100)
                tbill = 2 * units;
            else if (units > 100 && units <= 200)
                tbill = 4.50 * units;
            else if (units > 200 && units <= 500)
                tbill = 6 * units;
            else
                tbill = 7 * units;
        }
    }

    void display() {
        System.out.println("\n\t Consumer number = " + bn);
        System.out.println("\n\t Consumer name = " + cname);
        if (type.equals("D")) {
            // TODO: Print out what kind of connection the consumer is having
            System.out.println("\n\t type of connection  = ");
        } else {
            // TODO: Print out what kind of connection the consumer is having

        }
        System.out.println("\n\t Current Month  Reading = " + current);
        System.out.println("\n\t Previous Month  Reading = " + previous);
        System.out.println("\n\t Total units = " + units);
        System.out.println("\n\t Total bill = RS " + tbill);
    }
}
