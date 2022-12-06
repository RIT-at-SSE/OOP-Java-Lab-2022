package c.currency.template;

public class Yen implements ICurrency {

    private double amount;

    public Yen(Integer amount) {
        this.amount = amount;
    }

    @Override
    public void toRupee() {
        double inr = amount * 0.60;
        System.out.println("YEN = " + amount + " equal to INR = " + inr);
    }

    @Override
    public void toDollar() {
        double usd = amount * 0.0073;
        System.out.println("YEN = " + amount + " equal to USD = " + usd);
    }

    @Override
    public void toEuro() {
        double euro = amount * 0.0070;
        System.out.println("YEN = " + amount + " equal to EUR = " + euro);
    }

    @Override
    public void toYen() {
        System.out.println("Yen = " + amount + " equal to Yen = " + amount); // no conversation needed
    }
}
