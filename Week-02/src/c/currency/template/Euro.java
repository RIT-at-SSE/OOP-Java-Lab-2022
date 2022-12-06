package c.currency.template;

import java.util.Scanner;

public class Euro implements ICurrency {

    private double euro;

    Scanner in = new Scanner(System.in);

    @Override
    public void toRupee() {
        System.out.println("Enter euro to convert into Rupees:");
        euro = in.nextInt();
        double inr = euro * 87;
        System.out.println("Euro =" + euro + "equal to INR=" + inr);
    }

    @Override
    public void toDollar() {
        System.out.println("Enter euro to convert into Dollar:");
        euro = in.nextInt();
        double usd = euro * 1.05;
        System.out.println("Euro =" + euro + "equal to USD=" + usd);
    }

    @Override
    public void toEuro() {
        System.out.println("You do not need convert the same currency");
    }

    @Override
    public void toYen() {
        System.out.println("Enter euro to convert into Yen  :");
        euro = in.nextInt();
        double yen = euro * 144;
        System.out.println("Euro =" + euro + "equal to Yen=" + yen);
    }
}
