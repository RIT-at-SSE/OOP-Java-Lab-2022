package c.currency.template;

import java.util.Scanner;

public class Dollar implements ICurrency {

    double inr;
    double usd;
    double euro;
    double yen;

    Scanner in = new Scanner(System.in);

    @Override
    public void toRupee() {
        System.out.println("Enter dollars to convert into Rupees:");
        usd = in.nextInt();
        inr = usd * 67;
        System.out.println("Dollar =" + usd + "equal to INR=" + inr);
    }

    @Override
    public void toDollar() {
        System.out.println("You do not need convert the same currency");
    }

    @Override
    public void toEuro() {

    }

    @Override
    public void toYen() {

    }
}
