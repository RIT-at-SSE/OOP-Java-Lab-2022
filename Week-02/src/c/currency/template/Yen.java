package c.currency.template;

import java.util.Scanner;

public class Yen implements ICurrency {

    private double yen;

    Scanner in = new Scanner(System.in);

    @Override
    public void toRupee() {
        System.out.println("Enter yen to convert into Rupees:");
        yen = in.nextInt();
        double inr = yen * 0.60;
        System.out.println("YEN=" + yen + "equal to INR=" + inr);
    }

    @Override
    public void toDollar() {
        System.out.println("Enter yen to convert into Dollars:");
        yen = in.nextInt();
        double usd = yen * 0.0073;
        System.out.println("YEN=" + yen + "equal to USD=" + usd);
    }

    @Override
    public void toEuro() {
        System.out.println("Enter yen to convert into Euros:");
        yen = in.nextInt();
        double euro = yen * 0.0070;
        System.out.println("YEN=" + yen + "equal to EUR=" + euro);
    }

    @Override
    public void toYen() {
        System.out.println("You do not need convert the same currency");
    }
}
