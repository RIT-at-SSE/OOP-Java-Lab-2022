package c.currency.template;

import java.util.Scanner;

public class Dollar implements ICurrency {

    private double usd;

    Scanner in = new Scanner(System.in);

    @Override
    public void toRupee() {
        System.out.println("Enter dollars to convert into Rupees:");
        usd = in.nextInt();
        double inr = usd * 67;
        System.out.println("Dollar =" + usd + " equal to INR=" + inr);
    }

    @Override
    public void toDollar() {
        System.out.println("You do not need convert the same currency");
    }

    @Override
    public void toEuro() {
        System.out.println("Enter dollars to convert into Euro:");
        usd = in.nextInt();
        double euro = usd * 0.95;
        System.out.println("Dollar =" + usd + " equal to EUR=" + euro);
    }

    @Override
    public void toYen() {
        System.out.println("Enter dollars to convert into Yen:");
        usd = in.nextInt();
        double yen = usd * 136;
        System.out.println("Dollar =" + usd + " equal to YEN=" + yen);
    }
}
