package c.currency.template;

import java.util.Scanner;

public class Euro implements ICurrency {

    private double amount;

    public Euro(Integer amount) {
        this.amount = amount;
    }

    @Override
    public void toRupee() {
        double inr = amount * 87;
        System.out.println("Euro = " + amount + " equal to INR = " + inr);
    }

    @Override
    public void toDollar() {
        double usd = amount * 1.05;
        System.out.println("Euro =" + amount + " equal to USD = " + usd);
    }

    @Override
    public void toEuro() {
        System.out.println("Euro = " + amount + " equal to EUR = " + amount); // no conversation needed
    }

    @Override
    public void toYen() {
        double yen = amount * 144;
        System.out.println("Euro = " + amount + " equal to Yen = " + yen);
    }
}
